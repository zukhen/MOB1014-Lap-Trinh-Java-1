package Lab7;

public class SinhVienIT extends SinhVienPoly{
    private final double diemJava;
    private final double diemCss;
    private final double diemHtml;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    double getDiem() {
        return (2*diemJava+diemHtml+diemCss)/4;
    }
}
