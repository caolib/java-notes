package java基础.src.API.String用法;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个字符串：");
        String str = sc.nextLine();
        System.out.println(str);

    }
}
