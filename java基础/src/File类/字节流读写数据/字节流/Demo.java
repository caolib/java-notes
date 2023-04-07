package java基础.src.File类.字节流读写数据.字节流;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    FileOutputStream:文件输出流用于将数据写入FiLe
    FileOutputStream(String name):创建文件输出流以指定的名称写入文件
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/files/fos.txt");
        /*
            调用系统功能创建了文件
            创建了字节输出流对象
            让字节输出流对象指向创建好的文件
         */
        fos.write(57);//写入的是字符‘9’

        //关闭文件输出流 并 释放与此流相关的任何系统资源
        fos.close();

    }
}
