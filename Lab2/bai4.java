package Lab2;

import java.util.Scanner;

public class bai4 {
    public static void giaiPTB1(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double kq;
            kq = -b / a;
            System.out.println("Phuong trinh co nghiem la x= " + kq);
        }
    }

    public static void giaiPTB2(double a, double b, double c) {
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

    public static void tinhTienDien(double soDien) {
        if (soDien < 0) {
            System.out.println("So dien phai >0");
        } else {
            if (soDien < 50) {
                System.out.println("So tien: " + (soDien * 1000));
            } else {
                System.out.println("So tien: " + (50 * 1000 + (soDien - 50) * 1200));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int chon = 0;
            double a, b, c;
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giai phuong trinh bac nhat");
            System.out.println("2. Giai phuong trinh bac 2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket thuc");
            System.out.println("+---------------------------------------------------+");
            while (true) {
                System.out.print("Chon chuc nang: ");
                try {
                    chon = Integer.parseInt(sc.nextLine());
                    switch (chon) {
                        case 1:
                            System.out.print("Nhap vao so a: ");
                            a = Double.parseDouble(sc.nextLine());
                            System.out.print("Nhap vao so b: ");
                            b = Double.parseDouble(sc.nextLine());
                            giaiPTB1(a, b);
                            break;
                        case 2:
                            System.out.print("Nhap vao so a: ");
                            a = Double.parseDouble(sc.nextLine());
                            System.out.print("Nhap vao so b: ");
                            b = Double.parseDouble(sc.nextLine());
                            System.out.print("Nhap vao so c: ");
                            c = Double.parseDouble(sc.nextLine());
                            giaiPTB2(a, b, c);
                            break;
                        case 3:
                            double soDien;
                            System.out.print("Nhap vao so dien su dung: ");
                            soDien = Double.parseDouble(sc.nextLine());
                            tinhTienDien(soDien);
                            break;
                        case 4:
                            System.exit(0);
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("***vui long nhap so***");
                }
            }
        }
    }
}
