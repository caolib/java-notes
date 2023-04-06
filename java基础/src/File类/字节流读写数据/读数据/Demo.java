package File类.字节流读写数据.读数据;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //创建流对象
        FileInputStream fis = new FileInputStream("src/files/fos.txt");

//        int i = fis.read();
//        System.out.println(i);
//        System.out.println((char) i);

//        for (int i = fis.read(); i != -1; ) {
//            System.out.print((char) i);
//            i = fis.read();
//        }
        //优化上面代码
//        int b;
//        while ((b = fis.read()) != -1) {
//            System.out.print((char) b);
//        }

        //一次读读一个字节数组
//        byte[] bys = new byte[5];
//        int len = fis.read(bys);//实际读取到字节的个数
//        System.out.println(len);
//        System.out.println(new String(bys, 0, len));
//
//
//        fis.read(bys);
//        System.out.println(new String(bys, 0, len));

        //优化上面代码
        byte[] bys = new byte[1024];//1024及其整数倍
        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        fis.close();


    }
}
