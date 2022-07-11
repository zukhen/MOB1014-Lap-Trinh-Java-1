package Lab5;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSanPham {

    ArrayList<SanPham> list = new ArrayList<>();
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter de thoat");
        while (true) {
            System.out.print("Nhap ten san pham: ");
            String name = sc.nextLine();
            if (name.isBlank()) {
                System.out.println("nhap du lieu thanh cong");
                break;
            }
            System.out.println("Nhap gia san pham:" );
            double gia = Double.parseDouble(sc.nextLine());
            list.add(new SanPham(name,gia));
        }
    }
    public void xuat(){
        for (SanPham x:list) {
            System.out.println(x.getTenSp()+"-------------------"+x.getDonGia());
        }
    }
    public void sapxep()
    {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.donGia,o2.donGia);
            }
        };
        Collections.sort(list,comp);
        xuat();
    }
    public void xoa() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao ten ban muon xoa: ");
        for (SanPham x : list) {
            if (sc.nextLine().equals(x)) {
                list.remove(x);
                System.out.println("Xoa thanh cong");
                break;
            }
        }
        xuat();
    }
    public void tinhAVG()
    {
        double avg=0,sum=0;
        for (SanPham x : list) {
            sum+=x.getDonGia();
        }
        avg=sum/list.size();
        System.out.println("Gia trung binh la: "+avg);
    }
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        while (true) {
            System.out.println("+---------------------------------------------------+");
            System.out.println("1: Nhap danh sach san pham tu ban phim");
            System.out.println("2: Xuat danh sach san pham theo gia giam dan");
            System.out.println("3: Tim va xoa san pham theo ten");
            System.out.println("4: Xuat gia trung binh");
            System.out.println("+---------------------------------------------------+");
            while (true) {
                System.out.print("Moi ban chon: ");
                try {
                    chon = Integer.parseInt(sc.nextLine());
                    switch (chon) {
                        case 1:
                            nhap();
                            break;
                        case 2:
                            sapxep();
                            break;
                        case 3:
                            xoa();
                            break;
                        case 4:
                            tinhAVG();
                            break;
                        case 6:
                            System.exit(0);

                    }
                } catch (NumberFormatException ex) {
                    System.out.println("***vui long nhap so***");
                }
            }
        }
    }
}
