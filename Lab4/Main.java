package Lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SanPham sp = new SanPham("hoa hong", 100000, 10);
        sp.xuat();
        //bai 2
        SanPham sp2 = new SanPham();
        sp.nhap();
        sp2.nhap();
        sp.xuat();
        sp2.xuat();
        //bai3
        SanPham sp3 = new SanPham("hoa hong", 100000, 10);
        SanPham sp33 = new SanPham("SP2", 1000000);
        sp3.xuat();
        sp33.xuat();
    }
}
