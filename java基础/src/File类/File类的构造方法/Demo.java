package File类.File类的构造方法;

import java.io.File;

/*
    FiLe(String pathname):通过将给定的路径名字符串转换为抽象路径名来创建新的FiLe实例。
    File(String parent,String child):从父路径名字符串和子路径名字符串创建新的File实例。
    FiLe(File parent,String child):从父抽象路径名和子路径名字符串创建新的File实例。
 */
public class Demo {
    public static void main(String[] args) {
        //FiLe(String pathname):通过将给定的路径名字符串转换为抽象路径名来创建新的FiLe实例。
        File f1 = new File("X:\\Java项目\\java类和对象\\src\\File类\\File类的构造方法\\java.txt");
        System.out.println("f1 = " + f1);

        //File(String parent,String child):从父路径名字符串和子路径名字符串创建新的File实例。
        File f2 = new File("X:\\Java项目\\java类和对象\\src\\File类\\File类的构造方法", "java.txt");
        System.out.println("f2 = " + f2);

        //FiLe(File parent,String child):从父抽象路径名和子路径名字符串创建新的File实例。
        File f3 = new File("X:\\Java项目\\java类和对象\\src\\File类\\File类的构造方法");
        File f4 = new File(f3, "java.txt");
        System.out.println("f4 = " + f4);

    }
}
