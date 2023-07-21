package javaSE.src.API.File类.字节流读写数据.异常处理;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
    字节流写数据的异常处理
 */
public class Demo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
//            fos = new FileOutputStream("K:/src/files/fos.txt");
            fos = new FileOutputStream("src/files/fos.txt");
            fos.write("你干嘛哈哈哎哟".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
