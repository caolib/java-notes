package javaSE.src.案例.File案例;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 复制图片 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\12655\\Desktop\\wuhu.png");
        FileInputStream fis = new FileInputStream("C:\\Users\\12655\\Pictures\\Camera Roll\\image_9.png");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fis.close();
        fos.close();

    }
}
