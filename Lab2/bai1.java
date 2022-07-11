package Lab2;

import java.util.Scanner;

public class bai1 {
    static void slove(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double kq;
            kq = -b / a;
            System.out.println("Phuong trinh co nghiem la x= " + kq);
        }

    }

    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap vao so b: ");
        b = Double.parseDouble(sc.nextLine());

        slove(a, b);
    }
}
