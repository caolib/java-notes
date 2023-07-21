package javaSE.src.API.Math;
/*
    Math的常用方法
 */

public class MathDemo {
    public static void main(String[] args) {
        //1、返回参数的绝对值
        System.out.println("Math.abs(-6) = " + Math.abs(-6));
        System.out.println("Math.abs(6) = " + Math.abs(6));
        System.out.println("----------");

        //2、返回大于或等于参数的最小double值，等于一个整数
        System.out.println("Math.ceil(12.01) = " + Math.ceil(12.01));
        System.out.println("Math.ceil(12.99) = " + Math.ceil(12.99));
        System.out.println("----------");

        //3、返回小于或等于参数的最大double值，等于一个整数
        System.out.println("Math.floor(12.01) = " + Math.floor(12.01));
        System.out.println("Math.floor(12.99) = " + Math.floor(12.99));
        System.out.println("----------");

        //4、按照四舍五入返回接近参数的int值,参数为float类型
        System.out.println("Math.round(12.01f) = " + Math.round(12.01f));
        System.out.println("Math.round(12.99F) = " + Math.round(12.99F));
        System.out.println("----------");

        //5、返回参数中较大的值
        System.out.println("Math.max(666,999) = " + Math.max(666, 999));
        System.out.println("----------");

        //6、返回参数中较小的值
        System.out.println("Math.min(666,999) = " + Math.min(666, 999));
        System.out.println("----------");

        //7、返回a的b次幂
        System.out.println("Math.pow(1.01,365.0) = " + Math.pow(1.01, 365.0));
        System.out.println("----------");

        //8、返回[0,1)的随机数，返回值类型为double
        System.out.println("Math.random() = " + Math.random());

    }
}
