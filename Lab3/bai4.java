package Lab3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bai4 {
    static void sapxepSinhVien(String ten[], double diem[]) {
        for (int i = 0; i < ten.length - 1; i++) {
            for (int j = 0; j < ten.length - 1; j++) {
                if (diem[i] > diem[j]) {
                    double temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;
                    //sinh vien
                    String tempSV = ten[i];
                    ten[i] = ten[j];
                    ten[j] = tempSV;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("nhap vao so luong sinh vien: ");
        n = Integer.parseInt(sc.nextLine());
        String[] ten = new String[n];
        double[] diem = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao ten sinh vien thu %d: ", i + 1);
            ten[i] = sc.nextLine();
            System.out.printf("Nhap vao diem sinh vien thu %d: ", i + 1);
            diem[i] = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Mang sinh vien: " + Arrays.toString(ten));
        System.out.println("Mang diem sinh vien: " + Arrays.toString(diem));
        sapxepSinhVien(ten, diem);
        for (int i = 0; i < n; i++) {
            System.out.println("Ho ten: " + ten[i]);
            System.out.println("Diem: " + diem[i]);
            if (diem[i] >= 9) {
                System.out.println("Hoc luc: Xuat Sac");
            } else if (diem[i] >= 7.5 && diem[i] < 9) {
                System.out.println("Hoc luc: Gioi");
            } else if (diem[i] >= 6.5 && diem[i] < 7.5) {
                System.out.println("Hoc luc: Kha");
            } else if (diem[i] >= 5 && diem[i] < 6.5) {
                System.out.println("Hoc luc: Trung Binh");
            } else {
                System.out.println("Hoc luc: Yeu");
            }
        }
    }
}
