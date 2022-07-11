package Lab3;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class bai1 {
    static boolean slove(int a) {
        if (a < 0 || a==1) {
            return false;
        } else {
            for (int i = 2; i <=Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap vao 1 so nguyen tu ban phim");
            try {
                a = Integer.parseInt(sc.nextLine());
                slove(a);
                if (slove(a))
                {
                    System.out.println(a+" la so nguyen to");
                }
                else {
                    System.out.println(a+ " khong phai la so nguyen to");

                }
                break;
            } catch (NumberFormatException ex) {
                System.out.print("***vui long nhap so***");
            }
        }
    }
}

