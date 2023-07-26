package javaSE.src.Case.字符串;

import java.util.Scanner;

public class 字符串反转pro {
    public static void main(String[] args) {
        //输入一个字符串，将其反转并输出
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个字符串：");
        String str = sc.nextLine();
        System.out.println(reverseStr(str));

    }

    public static String reverseStr(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
