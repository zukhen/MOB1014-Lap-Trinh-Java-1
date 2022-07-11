package Lab8;

import java.util.Scanner;

public class bai3 {
    public static String InHoa(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String item = words[i];
            String ch = item.substring(0, 1).toUpperCase();
            item = ch + item.substring(1).toLowerCase();
            sb.append(item).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen;
        System.out.println("Nhap vao ho ten cua ban: ");
        hoTen = sc.nextLine();
        System.out.println(InHoa(hoTen));
    }
}
