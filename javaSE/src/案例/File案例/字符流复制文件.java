package javaSE.src.案例.File案例;

import java.io.*;

public class 字符流复制文件 {
    public static void main(String[] args) throws IOException {
        String path = "C://Users//onebot//Desktop//1.txt";
        String targetPath = "C://Users//onebot//Desktop//2.txt";

        long start = System.currentTimeMillis();
//        method1(path, targetPath);          //耗时411ms
//        method2(path, targetPath);          //耗时173ms
//        method3(path, targetPath);          //耗时245ms
//        method4(path, targetPath);          //耗时146ms


        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - start) + "ms");
    }

    //1 字符流一次一个字符
    public static void method1(String path, String targetPath) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(targetPath));
        int len;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        isr.close();
        osw.close();
    }

    //2 字符流一次一个数组
    public static void method2(String path, String targetPath) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(targetPath));
        int len;
        char[] chs = new char[1024];
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, len);
        }
        isr.close();
        osw.close();
    }

    //3 字符缓冲流一次一个字符
    public static void method3(String path, String targetPath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        BufferedWriter bw = new BufferedWriter(new FileWriter(targetPath));

        int len;
        while ((len = br.read()) != -1) {
            bw.write(len);
        }
        br.close();
        bw.close();
    }

    //4 字符缓冲流一次一个数组
    public static void method4(String path, String targetPath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        BufferedWriter bw = new BufferedWriter(new FileWriter(targetPath));
        int len;
        char[] chs = new char[1024];
        while ((len = br.read(chs)) != -1) {
            bw.write(chs, 0, len);
        }
        br.close();
        bw.close();
    }

}
