package Lab1;

import java.util.Scanner;

public class bai2 {


    public static void main(String[] args) {
        double dai, rong;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chieu dai hinh chu nhat: ");
        dai = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap vao chieu rong hinh chu nhat: ");
        rong = Double.parseDouble(sc.nextLine());
        System.out.println("Chu vi la: "+((dai+rong)*2));
        System.out.println("Dien tich la: "+(dai*rong));
        System.out.println("Canh nho nhat la: "+Math.min(dai,rong));
    }
}
