package javaSE.src.案例.实验报告.实验七;

import java.io.File;

public class Ex2 {
    public static void main(String[] args) {
        File f = new File("javaSE/src/案例/实验报告");
        list(f);
    }

    public static void list(File file) {
        String[] list = file.list();
        if (list != null) {
            for (String s : list) {
                System.out.println(s);
                //当前文件夹的路径加上文件名就是文件的路径
                File f = new File(file.getAbsoluteFile() + "/" + s);
                if (f.isDirectory()) {
                    list(f);
                }
            }
        }
    }
}
