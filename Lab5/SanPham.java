package Lab5;

import java.util.Scanner;

public class SanPham {
    public String tenSp;
    public double donGia;
    public double giamGia;

    public SanPham() {
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia=0;
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

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    private double getThueNhapKhau(){
        return donGia*0.1;
    }
    public void xuat(){
        System.out.println("ten san pham: "+getTenSp());
        System.out.println("gia san pham: "+getDonGia());
        System.out.println("giam gia: "+getGiamGia());
        System.out.println("thue nhap khau: "+getThueNhapKhau());
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        //dung getter/setter tang tinh bao mat
        System.out.println("Nhap vao ten san pham: ");
        setTenSp(sc.nextLine());
        System.out.println("Nhap vao gia san pham: ");
       setDonGia(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhap vao giam gia: ");
        setGiamGia(Double.parseDouble(sc.nextLine()));
    }
}
