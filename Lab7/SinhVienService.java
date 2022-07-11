package Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SinhVienService {
    ArrayList<SinhVienPoly> list = new ArrayList<>();
    private String hoTen, chuyenNganh;
    private SinhVienPoly sv;
    private Scanner sc = new Scanner(System.in);

    private double diemJava, diemCss, diemHtml, diemMarketing, diemSales;

    private String getInputValue(String msg) {
        System.out.printf("Nhap vao: %s", msg);
        return sc.nextLine();
    }

    public void nhap() {
        while (true) {
            System.out.print("Nhap vao ten sinh vien: ");
            hoTen = sc.nextLine();
            if (hoTen.isBlank())
                break;
            System.out.print("Nhap vao chuyen nganh(IT/BIZ): ");
            chuyenNganh = sc.nextLine();
            switch (chuyenNganh) {
                case "IT":
                case "it":
                    System.out.print("Nhap diem Java: ");
                    diemJava = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap diem Css: ");
                    diemCss = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap diem Html: ");
                    diemHtml = Double.parseDouble(sc.nextLine());
                    list.add(new SinhVienIT(hoTen, chuyenNganh, diemJava, diemCss, diemHtml));
                    break;
                case "BIZ":
                case "biz":
                    System.out.print("Nhap diem Marketing: ");
                    diemMarketing = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap diem Sales: ");
                    diemSales = Double.parseDouble(sc.nextLine());
                    list.add(new SinhVienBiz(hoTen, chuyenNganh, diemMarketing, diemSales));
                    break;
            }
        }
    }

    public void xuat() {
        for (SinhVienPoly sv : list) {
            System.out.printf("Ho ten: %s | Nganh: %s | Diem TB: %.2f | Hoc luc: %s\n", sv.getHoTen().toUpperCase(), sv.getNganh(), sv.getDiem(), sv.getHocLuc());
        }
    }

    public void xuatHocLuc() {
        for (SinhVienPoly sv : list) {
            if (sv.getHocLuc().equalsIgnoreCase("Gioi")) xuat();
        }
    }

    public void sapxep() {

        Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                return Double.compare(o1.getDiem(), o2.getDiem());
            }
        };
        Collections.sort(list, comp);
        Collections.reverse(list);
        xuat();
    }

}
