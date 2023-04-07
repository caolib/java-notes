package java基础.src.File类.File类创建功能;

import java.io.File;
import java.io.IOException;

/*
    public boolean createNewFile():当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
    public boolean mkdir():创建由此抽象路径名命名的目录
    public boolean mkdirs():创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录

注意：
    如果不存在，就创建，并返回true
    如果存在，就不创建，并返回false
    创建失败也返回false
    创建的是文件还是目录要根据调用的方法来判断，因为你也可以创建一个名字为java.txt的目录
    同一个目录下如果有以java.txt为名的目录，那么就不能再创建java.txt文件
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //在src目录下创建一个目录files
        File f1 = new File("X:\\Java项目\\java类和对象\\src\\files");
        System.out.println(f1.mkdir());

        //在files目录下创建文件java.txt
        File f2 = new File("X:\\Java项目\\java类和对象\\src\\files\\java.txt");
        System.out.println(f2.createNewFile());

        //在files目录下创建一个多级目录java\javase
        File f3 = new File("X:\\Java项目\\java类和对象\\src\\files\\java\\javase");
        System.out.println(f3.mkdirs());


    }
}
