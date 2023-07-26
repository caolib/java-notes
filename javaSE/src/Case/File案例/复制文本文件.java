package javaSE.src.Case.File案例;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 复制文本文件 {
    public static void main(String[] args) throws IOException {
        //将 src/files/fos.txt 复制到 src/files/java/wuhu目录下
        FileInputStream fis = new FileInputStream("src/files/fos.txt");
        FileOutputStream fos = new FileOutputStream("src/files/java/wuhu/fos.txt");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fis.close();
        fos.close();

    }
}
