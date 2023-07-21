package javaSE.src.多态.多态中成员访问特点;

class Animal {
    public int age = 40;

    public void eat() {
        System.out.println("动物在吃东西");
    }
}

class Cat extends Animal {
    public int age = 20;
    public int weight = 10;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame() {
        System.out.println("猫在玩");
    }
}

public class Demo {
    public static void main(String[] args) {
        //父类引用指向子类对象
        Animal a = new Cat();

        System.out.println(a.age);
//        System.out.println(a.weight);

        a.eat();
//        a.playGame();

        //成员变量编译运行都看左边（都使用父类变量）
        //成员方法编译看父类，执行时使用的是子类的方法
        //原因：成员方法重写了，而成员变量没有重写


    }
}
