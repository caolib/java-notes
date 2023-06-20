package java基础.src.内部类.内部类;

/*
    内部类格式：
    public class 类名{
        修饰符 class 类名{

        }
    }
    访问特点：
    内部类可以直接访问外部类所有成员，包括私有
    外部类要访问内部类成员，必须创建对象

 */
public class Outer {
    private int num = 10;

    public void method() {
//        show();   必须创建对象才能访问内部类的成员
        Inner i = new Inner();
        i.show();


    }

    public class Inner {
        public void show() {
            System.out.println(num);
        }
    }

}
