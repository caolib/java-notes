package java基础.src.File类.字符缓冲流;

/*
    字符缓冲流：
    BufferedWriter:将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入，可以指定缓冲区大小，默认足够大
    BufferedReader:.从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取
    构造方法：
    BufferedWriter(Writer out)
    BufferedReader(Reader in)
 */

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        //字符缓冲流复制文件
        BufferedReader br = new BufferedReader(new FileReader("C://Users//onebot//Desktop//1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users//onebot//Desktop//6.txt"));
//        int len;
//        while ((len = br.read()) != -1) {
//            bw.write(len);
//        }

        int len;
        char[] chs = new char[1024];
        while ((len = br.read(chs)) != -1) {
            bw.write(new String(chs, 0, len));
        }


        br.close();
        bw.close();


    }
}
