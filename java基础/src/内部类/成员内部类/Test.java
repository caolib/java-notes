package java基础.src.内部类.成员内部类;

public class Test {
    public static void main(String[] args) {
        //创建内部类对象，调用方法
//        Inner i = new Inner();    不能直接创建内部类
//        Outer.Inner oi = new Outer().new Inner();
//        oi.show();

        //内部类往往是私有的，不能直接创建对象并访问show方法
        //可以通过外部类方法创建内部类并访问内部类的方法

        Outer o = new Outer();
        o.method();

    }
}
