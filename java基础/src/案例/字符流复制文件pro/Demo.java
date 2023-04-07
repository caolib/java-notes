package java基础.src.案例.字符流复制文件pro;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/案例/字符流复制文件pro/Demo.java");
        FileWriter fw = new FileWriter("src/案例/copy.txt");

//        int ch;
//        while ((ch = fr.read()) != -1) {
//            fw.write(ch);
//        }

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }


        fr.close();
        fw.close();

    }
}
