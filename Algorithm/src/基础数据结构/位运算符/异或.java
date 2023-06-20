package Algorithm.src.基础数据结构.位运算符;

public class 异或 {
    public static void main(String[] args) {
        /**
         * <h1 color="#10ac84">两个数异或相当于二进制的无进位相加</h1>
         * */

        System.out.println(5 ^ 9);
        System.out.println(0 ^ 1);
        System.out.println(3 ^ 3);

        int a = 10;
        int b = 6;

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);

    }
}
