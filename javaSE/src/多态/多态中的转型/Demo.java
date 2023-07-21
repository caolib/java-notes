package javaSE.src.多态.多态中的转型;

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

    public void play() {
        System.out.println("猫在玩");
    }
}

public class Demo {
    public static void main(String[] args) {
        //向上转型
        Animal a = new Cat();
        a.eat();

        //向下转型
        Cat c = (Cat) a;
        c.eat();
        c.play();


    }
}
