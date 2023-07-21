package javaSE.src.抽象类.抽象类;

/**
 * abstract 抽象关键字
 * 抽象类不一定有抽象方法,有抽象方法的一定是抽象类
 * 抽象类的派生类要么重写抽象方法，要么声明自己为抽象类
 * 抽象类不能直接实例化对象，但可以利用多态，用子类实例化对象
 */

abstract class Animal {

    public abstract void eat();     //抽象方法

    public void sleep() {
        System.out.println("睡觉");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

public class Demo {
    public static void main(String[] args) {
//        Animal a = new Animal();      抽象类不能直接创建对象
//        a.eat();

        /*
        Animal b = new Animal(){
            @Override
            void eat(){
                System.out.println("amagi");
            }
        };
        b.eat();
        */

        Animal a = new Cat();
        a.eat();
        a.sleep();


    }
}
