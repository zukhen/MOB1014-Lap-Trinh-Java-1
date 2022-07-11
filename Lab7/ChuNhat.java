package Lab7;

public class ChuNhat {
    private double rong;
    private double dai;



    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }
    public double getChuVi()
    {
        return (dai+rong)*2;
    }
    public double getDienTich()
    {
        return (dai*rong);
    }
    public void xuat()
    {
        System.out.printf("Chu vi: %2f \nDien tich: %2f",getChuVi(),getDienTich());
    }
}
