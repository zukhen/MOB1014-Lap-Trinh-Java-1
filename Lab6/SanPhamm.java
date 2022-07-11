package Lab6;

import java.util.Scanner;

public class SanPhamm {
    private String tenSp;
    private double donGia;
    private String hang;

    public SanPhamm(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }

    public SanPhamm() {
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten san pham: ");
        setTenSp(sc.nextLine());
        System.out.println("Nhap vao don gia: ");
        setDonGia(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap vao hang: ");
        setHang(sc.nextLine());
    }

    public void xuat() {
        System.out.printf("Ten san pham: %s \n Hang: %s \n Don gia: %2f", getTenSp(),getHang(),getDonGia());
    }
}
