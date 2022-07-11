package Lab2;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soDien;
        System.out.print("Nhap vao so dien su dung: ");
        soDien = Double.parseDouble(sc.nextLine());
        if (soDien < 0) {
            System.out.println("So dien phai >0");
        } else {
            if (soDien < 50) {
                System.out.print("So tien: " + (soDien * 1000));
            } else {
                System.out.print("So tien: "+(50*1000 + (soDien - 50)*1200));
            }
        }
    }
}
