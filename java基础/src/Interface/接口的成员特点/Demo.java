package java基础.src.Interface.接口的成员特点;

interface Inter {
    //接口的成员变量默认为 公有+静态+常量 即默认带有 public static final 修饰
    int num = 10;
    public static final int num2 = 20;
    //    public static final int num3 = 0;     与下面一行等价
    int num3 = 0;

    //    public Inter(){}   接口没有构造函数
//    public void fun(){}  接口不能有具体的方法，只能有抽象方法
    void method();   //接口的方法是抽象的，默认带有 public abstract 修饰

    //从Java8开始接口中可以存在默认方法和静态方法
    default void fun() {
    };

    static void fun2(){
    };
}

//接口的实现类
class InterImpl extends Object implements Inter {
    //一个类没有父类也能调用super()方法，因为所有类默认继承了Object类，即带有extends Object
    public InterImpl() {
        super();    //接口没有构造方法，此处调用的是Object的构造方法
    }

    @Override
    public void method() {
        System.out.println("method方法调用");
    }
}

public class Demo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
//        i.num = 10;
//        i.num2 = 20;
        //接口中的成员变量默认是 静态常量
        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println(Inter.num);
        System.out.println(Inter.num2);
        i.method();
    }
}
