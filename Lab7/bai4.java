package Lab7;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int chon ;
        SinhVienService sinhVienService = new SinhVienService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("+------------------------------------------------+");
            System.out.println("1: Nhap danh sach sinh vien");
            System.out.println("2: Xuat thong tin danh sach sinh vien");
            System.out.println("3: Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4: Sap xep danh sach sinh vien diem giam dan");
            System.out.println("+------------------------------------------------+");
            while (true) {
                System.out.print("Moi chon: ");
                try {
                    chon = Integer.parseInt(sc.nextLine());
                    switch (chon) {
                        case 1 -> sinhVienService.nhap();
                        case 2 -> sinhVienService.xuat();
                        case 3 -> sinhVienService.xuatHocLuc();
                        case 4 -> sinhVienService.sapxep();
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("***vui long nhap so***");
                }

            }
        }
    }
}
