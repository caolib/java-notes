package javaSE.src.File类.字节流读写数据.换行和追加写入;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //如果第二个参数为true，则写入模式为追加写入
//        FileOutputStream fos = new FileOutputStream("src/files/fos.txt");
        FileOutputStream fos = new FileOutputStream("src/files/fos.txt", true);
        for (int i = 0; i < 10; i++) {
            fos.write("芜湖\n".getBytes());
        }

        fos.close();
    }
}
