package Lab7;

public class SinhVienBiz extends SinhVienPoly {
    private final double diemMarketing;
    private final double diemSales;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    double getDiem() {
        return (2*diemMarketing+diemSales)/3;
    }
}
