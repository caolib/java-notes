package javaSE.src.File类.File类判断和获取功能;
/*
    public boolean isDirectory():测试此抽象路径名表示的FiLe是否为目录
    public boolean isFile():测试此抽象路径名表示的FiLe是否为文件
    public boolean exists():测试此抽象路径名表示的FLe是否存在
    public String getAbsolutePath():返回此抽象路径名的绝对路径名字符串
    public String getPath():将此抽象路径名转换为路径名字符串
    public String getName():返回由此抽象路径名表示的文件或目录的名称
    public String.[]List():返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
    public File[]listFiles():返回此抽象路径名表示的目录中的文件和目录的File对象数组
 */

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        File f = new File("src/files/java.txt");
        System.out.println(f.isDirectory());//判断是否为目录
        System.out.println(f.isFile());//判断是否为文件
        System.out.println(f.exists());//判断是否存在

        System.out.println(f.getAbsoluteFile());//绝对路径
        System.out.println(f.getPath());//相对路径
        System.out.println(f.getName());//文件名称
        System.out.println("------------");

        File f2 = new File("src/files");
        String[] strarr = f2.list();//返回 目录下所有文件和目录的名称的字符串数组
        for (String str : strarr) {
            System.out.println(str);
        }
        System.out.println("------------");

        File[] files = f2.listFiles();//返回 目录下所有文件和目录的文件对象数组
        for (File ff : files) {
            System.out.println(ff);
        }


    }
}
