package javaSE.src.Exception;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        //实现对Person对象信息的录入
        //姓名长度2-4，年龄0-100
        //要求输入各种可能会导致错误的信息还能运行
        Person p = new Person();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("输入姓名:");
                p.setName(sc.nextLine());

                System.out.print("输入年龄:");
                p.setAge(Integer.parseInt(sc.nextLine()));
                break;
            } catch (NumberFormatException | NameFormatException | AgeOutOfBoundException e) {
                e.printStackTrace();
            }
        }
        System.out.println(p);
    }
}
