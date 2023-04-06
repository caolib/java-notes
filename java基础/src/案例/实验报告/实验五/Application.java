package 案例.实验报告.实验五;

/**
 * 1. 设计一个动物声音“模拟器”，希望模拟器可以模拟许多动物的叫声。要求如下：
 * 	编写抽象类Animal
 * Animal抽象类有2个抽象方法cry()和getAnimaName()，即要求各种具体的动物给出自己的叫声和种类名称。
 * 	编写模拟器类Simulator
 * 该类有一个playSound(Animal animal)方法，该方法的参数是Animal类型。即参数animal可以调用Animal的子类重写的cry()方法播放具体动物的声音、调用子类重写的getAnimalName()方法显示动物种类的名称。
 * 	编写Animal类的子类：Dog，Cat类
 * 图5.18是Simulator、Animal、Dog、Cat的UML图。
 * 编写主类Application（用户程序）
 * 在主类Application的main方法中至少包含如下代码：
 * Simulator simulator = new Simulator();
 * simulator.playSound(new Dog());
 * simulator.playSound(new Cat());
 */

abstract class Animal {

    abstract void cry();

    abstract String getAnimalName();

}

class Dog extends Animal {

    @Override
    void cry() {
        System.out.println("汪汪汪");
    }

    @Override
    String getAnimalName() {
        return "狗";
    }
}

class Cat extends Animal {

    @Override
    void cry() {
        System.out.println("喵喵喵");
    }

    @Override
    String getAnimalName() {
        return "猫";
    }
}

class Simulator {
    public void playSound(Animal animal) {
        System.out.print(animal.getAnimalName());
        System.out.print(":");
        animal.cry();
    }
}

public class Application {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
    }
}
