package Lab2;

import java.util.Scanner;

public class bai2 {
    static void slove(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double kq;
                kq = -c / b;
                System.out.println("Phuong trinh co nghiem la x=" + kq);
            }
        } else {
            double delta;
            delta = Math.pow(b, 2) - 4 * a * c;
            if (Math.sqrt(delta) > 0) {
                double x1, x2;
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh hai  co nghiem\n x1: " + x1 + "\nx2: " + x2);

            } else if (Math.sqrt(delta) == 0) {
                double nghiepKep;
                nghiepKep = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: " + nghiepKep);

            } else {
                System.out.println("Phuong trinh vo nghiem");

            }
        }
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap vao so b: ");
        b = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap vao so c: ");
        c = Double.parseDouble(sc.nextLine());
        slove(a, b, c);
    }
}
