package javaSE.src.Case.实验报告.实验七;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("hello.txt"));
        osw.write("HelloJavaWorld你好世界");
        osw.close();
    }
}
