package java基础.src.File类.字符流读数据;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/files/java.txt"));
        //一次读取一个字符
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.print((char) ch);
//        }

        //一次读一个数组的数据
        int len;
        char[] chs = new char[1024];
        while ((len = isr.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }


    }
}
