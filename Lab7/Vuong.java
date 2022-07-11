package Lab7;

public class Vuong extends ChuNhat{
    public Vuong(double canh) {
        super(canh, canh);
    }
    public void xuat()
    {
        System.out.printf("Dien tich hinh vuong la: %2f",getChuVi(),getDienTich());
    }
}
