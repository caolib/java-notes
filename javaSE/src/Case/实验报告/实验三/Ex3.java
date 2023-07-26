package javaSE.src.Case.实验报告.实验三;

public class Ex3 {
    public static void main(String[] args) {
        /*3. 编写一个Java应用程序，使用for循环计算8+88+888+8888+88888+…的前10项之和。*/
        long sum = 0;
        long x = 8;
        for (int i = 0; i < 10; i++) {
            sum += x;
            System.out.print(i == 9 ? x + "=" : x + "+");
            x = 10 * x + 8;
        }
        System.out.println(sum);

    }
}
