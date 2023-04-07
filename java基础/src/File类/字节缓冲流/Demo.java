package java基础.src.File类.字节缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
    BufferOutputStream:该类实现缓冲输出流。通过设置这样的输出流，应用程序可以向底层输出流泻入字节，而不必
    为写入的每个字节导致底层系统的调用
    BufferedInputStream：创健BufferedInputStream将创健一个内部缓冲区数组。当从流中读取或跳过字节时，内部缓
    冲区将根据需要从所包含的输入流中重新填充，一次很多字节
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //创建字节缓冲输出流
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/files/bos.txt"));
//        bos.write("hello\n".getBytes());
//        bos.write("world\n".getBytes());
//        bos.close();

        //创建字节缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(("src/files/bos.txt")));

//        int by;
//        while ((by = bis.read()) != -1) {
//            System.out.print((char) by);
//        }

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }


    }
}
