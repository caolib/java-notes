package java基础.src.API.BigDecimal;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BigDecimalDemo {
    @Test
    public void test01() {
        //使用double数据初始化，不可预知，可能会有精度丢失
//        System.out.println(new BigDecimal(0.01));
//        System.out.println(new BigDecimal(0.09));
        System.out.println(0.01 + 0.09);

        //使用字符串初始化
        System.out.println(new BigDecimal("0.09"));

        //使用valueOf初始化,0-10之间的整数是提前创建了对象的，单例
        BigDecimal d1 = BigDecimal.valueOf(10);
        BigDecimal d2 = BigDecimal.valueOf(10);
        System.out.println(d1 == d2);//true

        BigDecimal d3 = BigDecimal.valueOf(11);
        BigDecimal d4 = BigDecimal.valueOf(11);
        System.out.println(d3 == d4);//false


    }
}
