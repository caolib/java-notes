package javaSE.src.java面向对象.抽象类.抽象类的成员特点;

abstract class Animal {
    private final String city = "北京";
    private int age = 20;

    //抽象类中可以有构造函数，用于子类的构造函数
    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public void show() {
        age = 666;
        //city = "上海";
        System.out.println(age + " " + city);
    }

    public abstract void eat();

}

class Cat extends Animal {

    private String name;

    public Cat(String name, int age) {
        super(age);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void show() {
        System.out.print(name + " ");
        super.show();
    }
}

public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat("加菲", 6);
        a.eat();
        a.show();

    }
}
