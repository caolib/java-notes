package javaSE.src.案例.File案例;

import java.io.*;

public class 字符缓冲流复制文件 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/File类/字符缓冲流特有功能/Demo.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/案例/字符缓冲流复制文件.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            bw.write(str);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
