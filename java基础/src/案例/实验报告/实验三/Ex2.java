package java基础.src.案例.实验报告.实验三;

public class Ex2 {
    public static void main(String[] args) {
        /*2. 编写一个Java应用程序，使用while循环语句计算1~1000之间能被3和7同时整除的整数之和。*/
        int sum = 0;
        int i = 1;
        while (i <= 1000) {
            if (i % 21 == 0) {
                sum += i;
                System.out.print(i == 987 ? i + "=" : i + "+");
            }
            i++;
        }
        System.out.println(sum);

    }
}
