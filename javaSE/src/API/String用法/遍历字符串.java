package javaSE.src.API.String用法;

import java.util.Scanner;

//charAt 返回指定索引处的字符值
//length() 返回字符串的长度

public class 遍历字符串 {
    public static void main(String[] args) {
        //输入一个字符串，获取其每个字符
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个字符串：");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();


    }
}
