package Lab1;

import java.util.Scanner;

public class bai3 {
    static double slove(double canh)
    {
        return Math.pow(canh,3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double canh;
        System.out.print("Nhap vao canh cua 1 khoi lap phuong: ");
        canh = Double.parseDouble(sc.nextLine());
        System.out.println("The tich la: "+slove(canh));
    }
}
