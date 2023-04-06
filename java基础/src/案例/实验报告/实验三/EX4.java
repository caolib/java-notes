package 案例.实验报告.实验三;

public class EX4 {
    public static void main(String[] args) {
        /*. 编写一个Java应用程序，计算1-1/3+1/5-1/7+1/9-1/11+…的前10000项之和。*/
        double sum = 0;
        int k = 1;
        for (int i = 1; i <= 10000; i++) {
            sum += 1.0 * k / (2 * i - 1);
            System.out.print(k + "/" + (2 * i - 1) + (i == 10000 ? ("=") : (k == 1 ? "" : "+")));
            k = -1 * k;
        }
        System.out.println(sum);

    }
}
