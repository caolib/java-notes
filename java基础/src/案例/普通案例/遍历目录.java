package java基础.src.案例.普通案例;

import java.io.File;

public class 遍历目录 {
    public static void main(String[] args) {
        //遍历一个目录，将目录中所有文件的绝对路径输出到控制台
        //遍历X盘，输出所有文件路径
        File f = new File("X:\\");
        getAllFiles(f);


    }

    public static void getAllFiles(File f) {
        File[] files = f.listFiles();
        if (files != null) {
            for (File ff : files) {
                if (ff.isFile()) {
                    System.out.println(ff);
                } else {
                    getAllFiles(ff.getAbsoluteFile());
                }
            }
        }
    }
}
