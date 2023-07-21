package javaSE.src.java面向对象.多态.多态定义;

//多态：同一个对象，不同时刻表现出不同的形态
//有 继承/实现 关系
//有方法重写
//有父类引用指向子类对象


class Animal {
    public void eat() {
        System.out.println("动物在吃东西");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

public class Demo {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();
        a = new Cat();
        a.eat();
        a = new Dog();
        a.eat();

    }
}
