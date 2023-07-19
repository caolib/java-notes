package java基础.src.API.BigInteger;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Random;

public class BIDemo {
    @Test
    public void test01() {
        //1.获取BigInteger对象，初始化后值不能改变
        //获取[0~2^4-1]之间的随机整数
        for (int i = 0; i < 100; i++) {
            BigInteger bigInteger = new BigInteger(4, new Random());
            System.out.println("bigInteger = " + bigInteger);
        }
    }

    @Test
    public void test02() {
        //2.获取一个指定的大整数，字符串必须是整数
        System.out.println(new BigInteger("9999999999999999999999999999999999999"));

        //3.获取一个指定进制的数字，返回十进制数，字符串必须符合该进制写法
        System.out.println(new BigInteger("1010101000101", 2));

        System.out.println(new BigInteger("abc", 16));
    }

    @Test
    public void test03() {
        //3.使用Long数字初始化对象
        BigInteger bigInteger = BigInteger.valueOf(999);
        System.out.println(bigInteger);
        /*
         * 注意：
         *   1.参数为long类型，所以表示范围只有long的范围大小
         *   2.valueOf对-16~16进行了优化，提前创建了该范围内的对象，该范围内的对象都是同一个对象
         * */

        BigInteger b1 = BigInteger.valueOf(16);
        BigInteger b2 = BigInteger.valueOf(16);
        System.out.println(b1 == b2);//true

        BigInteger b3 = BigInteger.valueOf(17);
        BigInteger b4 = BigInteger.valueOf(17);
        System.out.println(b3 == b4);//false


    }
}
