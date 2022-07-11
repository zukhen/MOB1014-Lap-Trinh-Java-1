package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        SinhvienDAO sinhvienDAO = new SinhvienDAO();
        for (int i = 0; i < 2; i++) {
            sinhvienDAO.nhap();
        }
        sinhvienDAO.xuat();
    }
}
