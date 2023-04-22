package java基础.src.案例.实验报告.试验七;

import java.io.*;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("hello.txt"));
        osw.write("HelloJavaWorld你好世界");
        osw.close();
    }
}
