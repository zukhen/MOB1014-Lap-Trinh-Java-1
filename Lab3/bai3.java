package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, min, tong = 0;
        System.out.print("Nhap vao so phan tu cua mang: ");
        n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu thu %d: ", i + 1);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(array);
        System.out.println("Sap xep: "+ Arrays.toString(array));
        //max
        min = array[0];
        System.out.print("cac so chia het cho 3: ");
        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            // chia het cho 3
            if (array[i] % 3 == 0) {
                System.out.printf(array[i] + "\t");
                tong += array[i];
            }
        }
        //sapxep
        System.out.println("\nSo nho nhat: " + min);
        System.out.println("Tong so chia het cho 3: " + tong);
    }
}
