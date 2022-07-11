package Lab6;

import java.util.Scanner;

public class Sinhvien {
    private String hoTen;
    private String email;
    private String soDienThoai;
    private String CMND;

    public Sinhvien() {
    }

    public Sinhvien(String hoTen, String email, String soDienThoai, String CMND) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.CMND = CMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }



}
