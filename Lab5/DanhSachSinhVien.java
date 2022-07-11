package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachSinhVien {
    ArrayList<String> list = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter de thoat");
        while (true) {
            System.out.print("Nhap ho ten: ");
            String name = sc.nextLine();
            if (name.isBlank()) {
                System.out.println("nhap du lieu thanh cong");
                break;
            }
            list.add(name);
        }
    }

    public void xuat() {
        for (String x : list) {
            System.out.println(x);
        }
    }

    public void ngauNhien() {
        Collections.shuffle(list);
        xuat();
    }

    public void sapXep() {
        Collections.sort(list);
        Collections.reverse(list);
        xuat();
    }

    public void xoa() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao ten ban muon xoa: ");
        for (String x : list) {
            if (sc.nextLine().equals(x)) {
                list.remove(x);
                System.out.println("Xoa thanh cong");
                break;
            }
        }
        xuat();
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        while (true) {
            System.out.println("+---------------------------------------------------+");
            System.out.println("1: Nhap danh sach ho va ten");
            System.out.println("2: Xuat danh sach");
            System.out.println("3: Xuat danh sach ngau nhien");
            System.out.println("4: Sap xep giam dan va xuat danh sach");
            System.out.println("5: Tim va xoa ho ten nhap tu ban phim");
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
                            xuat();
                            break;
                        case 3:
                            ngauNhien();
                            break;
                        case 4:
                            sapXep();
                            break;
                        case 5:
                            xoa();
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
