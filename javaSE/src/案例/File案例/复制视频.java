package javaSE.src.案例.File案例;

import java.io.*;
/*
    基本字节流一次一个字节       7893ms
    基本字节流一次一个字节数组    23ms
    字节缓冲流一次一个字节       72ms
    字节缓冲流一次一个字节数组    8ms
 */

public class 复制视频 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

//        method1();
//        method2();
//        method3();
        method4();

        long end = System.currentTimeMillis();
        System.out.println("method1耗时：" + (end - start) + "ms");

    }

    //1、基本字节流一次读取一个字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\原视频\\开摆.avi");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\12655\\Desktop\\开摆.avi");
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fis.close();
        fos.close();
    }

    //2、基本字节流一次读取一个字节数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\原视频\\开摆.avi");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\12655\\Desktop\\开摆.avi");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys);
        }
        fis.close();
        fos.close();
    }

    //3、字节缓冲流一次读取一个字节
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\原视频\\开摆.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\12655\\Desktop\\开摆.avi"));
        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
        bis.close();
        bos.close();
    }

    //4、字节缓冲流一次读取一个字节数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\原视频\\开摆.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\12655\\Desktop\\开摆.avi"));
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys);
        }
        bis.close();
        bos.close();
    }
}
