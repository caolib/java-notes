package javaSE.src.API.System;

public class SystemDemo {
    public static void main(String[] args) {
        //1、exit终止当前运行的java虚拟机，非0表示异常终止
//        System.out.println("开始");
//        System.exit(0);
//        System.out.println("结束");


        //2、currentTimeMillis返回 当前时间 与 1970年1月1日 相差的时间(以毫秒为单位)
        System.out.println(System.currentTimeMillis());

        //查看大约相差多少年
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365 / 1.0 + "年");

        //查看程序运行耗时
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start) + " ms");

    }
}
