package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    static ArrayList<Double> list;
    static Scanner sc;

    public static void main(String[] args) {
        list = new ArrayList<>();
        sc = new Scanner(System.in);
        while (true) {
            double x = Double.parseDouble(sc.nextLine());
            list.add(x);
            System.out.print("Nhap them (Y/N)?: ");
            if (sc.nextLine().equalsIgnoreCase("N")) break;
        }
        //xuat
        for (Double x :list) {
            System.out.println(x);
        }
    }
}
