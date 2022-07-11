package Lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        String hoten;
        double diemTrungBinh;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        hoten=sc.nextLine();
        System.out.print("Diem trung binh: ");
        //khong bi troi lenh
        diemTrungBinh=Double.parseDouble(sc.nextLine());
        System.out.printf("%s \t %.0f",hoten,diemTrungBinh);
    }
}
