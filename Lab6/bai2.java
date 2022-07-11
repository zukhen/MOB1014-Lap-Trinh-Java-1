package Lab6;

import Lab5.SanPham;

import java.util.ArrayList;

public class bai2 {
    public static void main(String[] args) {
        ArrayList<SanPhamm> list = new ArrayList<>();
        for (int i = 0; i <=5; i++) {
            SanPhamm sp = new SanPhamm();
            sp.nhap();
            list.add(sp);
        }
        for (SanPhamm x:list) {
            if(x.getHang().equalsIgnoreCase("nokia"))
            {
                x.xuat();
            }
        }
    }
}
