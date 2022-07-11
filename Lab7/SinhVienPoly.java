package Lab7;

public abstract class SinhVienPoly {
    private final String hoTen;
    private final String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    abstract double getDiem();

    public String getHocLuc() {
        double diem = getDiem();
        if (diem >= 9) {
            return "Xuat sac";
        } else if (diem >= 7.5) {
            return "Gioi";
        } else if (diem >= 6.5) {
            return "Kha";
        } else if (diem >= 5) {
            return "Trung binh";
        } else return "Yeu";
    }
}
