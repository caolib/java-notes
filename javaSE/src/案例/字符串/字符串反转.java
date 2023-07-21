package javaSE.src.案例.字符串;

import java.util.Scanner;

public class 字符串反转 {
    public static void main(String[] args) {
        //输入一个字符串，将其反转并输出
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个字符串：");
        String str = sc.nextLine();
        System.out.println("反转后：" + reverseString(str));

    }

    public static String reverseString(String str) {
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s += str.charAt(i);
        }
        return s;
    }
}
