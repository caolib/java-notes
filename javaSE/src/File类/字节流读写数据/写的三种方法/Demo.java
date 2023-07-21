package javaSE.src.File类.字节流读写数据.写的三种方法;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    void write(intb):将指定的字节写入此文件输出流
    一次写一个字节数据
    void write(byte[]b):将b.Length字节从指定的字节数组写入此文件输出流
    一次写一个字节数组数据
    void write(byte[]b,int off,.int len):将Len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
    一次写一个字节数组的部分数据
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File f = new File("src/files/fos.txt");
        FileOutputStream fos = new FileOutputStream(f);
        //一次写一个数据abcde
//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(101);

        //一次写入一个数组
//        byte[] b = {97, 98, 99, 100, 101};
        byte[] b = "abcde".getBytes();
//        fos.write(b);

        //一次写入数组的部分数据
        fos.write(b, 1, 3);//从1开始写3个
        fos.close();
    }
}
