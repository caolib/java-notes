package javaSE.src.案例.普通案例;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("输入三角形的三条边：");
        try {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("输入数据类型错误");
            System.exit(1);
        }

        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                if (a == b || b == c || a == c) {
                    if (a == b && b == c) {
                        System.out.println("等边三角形");
                    } else {
                        System.out.println("等腰三角形");
                    }
                } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                    System.out.println("直角三角形");
                } else {
                    System.out.println("一般三角形");
                }
            } else {
                System.out.println("构不成三角形");
            }
        } else {
            System.out.println("构不成三角形");
        }

    }
}
