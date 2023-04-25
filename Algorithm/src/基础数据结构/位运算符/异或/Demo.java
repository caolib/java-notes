package Algorithm.src.基础数据结构.位运算符.异或;

/**
 * <h1 color="#10ac84">异或运算符 ^</h1>
 * <h2>1、0异或除0以外任何数都等于这个数</h2>
 * <h2>2、一个数异或自己等于0</h2>
 * <h2>3、两个数异或就相当于两个数的二进制每位都进行异或</h2>
 * <h2>4、两个数异或也相当于两个数的二进制进行不进位的加法（相加不进位）</h2>
 * */

public class Demo {
    public static void main(String[] args) {
        //使用异或运算符完成交换操作
        int a = 5;
        int b = 13;

        //有一个问题就是这两个值不能是同一个数，否则异或会等于0
        a = a^b;
        b = a^b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
