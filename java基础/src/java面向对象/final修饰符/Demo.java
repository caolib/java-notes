package java面向对象.final修饰符;

//注意：final修饰的类不可以派生

class Fu {
    //final修饰的方法为最终方法，不可以被重写，类似于c++的const关键字
    public final void method() {
        System.out.println("Fu method");
    }
}


class Zi extends Fu {
    public final int age = 20;
    //    @Override
//    public void method() {
//        System.out.println("Zi method");
//    }
    public String name = "张三";

    public void show() {
//        age = 100;        由final修饰后不能再改变
        System.out.println("age = " + age);
    }

}

public class Demo {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
        z.show();
        System.out.println("--------");

        //fianl修饰引用类型对象，地址值不能变，地址指向的内容可以变
        final Zi z2 = new Zi();
//        z2 = new Zi();
        z2.name = "cxk";
        System.out.println("z2.name = " + z2.name);

    }
}
