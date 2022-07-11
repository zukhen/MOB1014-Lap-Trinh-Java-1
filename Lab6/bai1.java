package Lab6;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ho ten cua ban: ");
        name=sc.nextLine();
        System.out.println("Ho: "+name.substring(0,name.indexOf(" ")).toUpperCase());
        System.out.println("Ten dem:"+name.substring(name.indexOf(" "),name.lastIndexOf(" ")).toUpperCase());
        System.out.println("Ten: "+name.substring(name.lastIndexOf(" ")).toUpperCase());
    }
}
