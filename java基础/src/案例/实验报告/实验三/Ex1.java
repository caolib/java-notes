package 案例.实验报告.实验三;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x:");
        float x = sc.nextFloat();
        float y = x >= 0 ? 3 * x - 1 : 2 * x - 1;
        System.out.println("y = " + y);

    }
}
