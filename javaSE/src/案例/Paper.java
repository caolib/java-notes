package javaSE.src.案例;

import org.junit.jupiter.api.Test;

public class Paper {
    @Test
    public void test() {
        for (int i = 0; i < 100000L; i++) {
            System.out.println(666);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

        System.out.println(666);
    }

    @Test
    public void test02() {
        Integer a = 128;
        Integer b = 128;
        Integer c = 127;
        Integer d = 127;

        System.out.println(a == b);
        System.out.println(c == d);
    }

    //实现快速排序算法
    public void sort() {

    }

}
