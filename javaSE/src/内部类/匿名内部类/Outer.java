package javaSE.src.内部类.匿名内部类;

/*
    前提：
    存在一个类或接口
    该类可以是具体类，也可以是抽象类

    格式：new 类名或接口名(){
        重写方法
    };

    匿名内部类本质：继承了类或实现了接口的匿名类对象

 */

public class Outer {
    public void method() {
        /*

        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        */

        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();


    }

}
