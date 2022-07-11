package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhvienDAO {
    private final ArrayList<Sinhvien> list = new ArrayList<>();
    Sinhvien sv = new Sinhvien();

    public boolean isEmail(String email) {
        String regEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        return email.matches(regEmail);
    }

    public boolean isPhone(String phone) {
        String regPhone = "[0-9]{10}";
        return phone.matches(regPhone);
    }

    public boolean isID(String CMND) {
        String regCMND = "[0-9]{11}";
        return CMND.matches(regCMND);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        SinhvienDAO sinhvienDAO = new SinhvienDAO();
        while (true) {
            System.out.print("Nhap vao ho ten: ");
            sv.setHoTen(sc.nextLine());
            if (sv.getHoTen().isBlank()) {
                System.out.println("Ho ten khong hop le");
            } else {
                break;
            }
        }
            while (true) {
                System.out.print("Nhap vao email: ");
                sv.setEmail(sc.nextLine());
                if (sinhvienDAO.isEmail(sv.getEmail())) {
                    break;
                }
                System.out.println("Email khong hop le");
            }
            while (true) {
                System.out.print("Nhap vao so dien thoai: ");
                sv.setSoDienThoai(sc.nextLine());
                if (sinhvienDAO.isPhone(sv.getSoDienThoai())) {
                    break;
                }
                System.out.println("So dien thoai khong hop le");
            }
            while (true) {
                System.out.print("Nhap vao cmnd: ");
                sv.setCMND(sc.nextLine());
                if (sinhvienDAO.isID(sv.getCMND())) {
                    break;
                }
                System.out.println("CMND khong hop le");
            }
        list.add(sv);
    }


    public void xuat()
    {
        for (Sinhvien x:list) {
            System.out.printf("Hoten: %s - Email: %s - SDT: %s - CMND: %s\n",x.getHoTen(),x.getEmail(),x.getSoDienThoai(),x.getCMND());
        }
    }
}
