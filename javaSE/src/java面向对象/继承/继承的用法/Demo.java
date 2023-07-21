package javaSE.src.java面向对象.继承.继承的用法;

public class Demo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Father f = new Father();
        f.show();

        Son s = new Son();
        s.method();
        s.show();       //Son继承了Father，所以可以调用Father类中的show方法


    }
}
