package javaSE.src.File类.File类删除功能;

//如果目录下有内容，那就不能直接删除

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //删除文件
        File f = new File("src\\files\\wuhu.txt");
//        System.out.println(f.createNewFile());
        System.out.println(f.delete());//删除文件

        //删除目录
        File f2 = new File("wuhu");
        System.out.println(f2.mkdir());
        System.out.println(f2.delete());

    }
}
