package java面向对象.类名作为形参和返回值;

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

class AnimalOperator {
    //这里的Animal不能直接实例化对象，所以必须派生子类利用多态实现
    public void useAnimal(Animal a) {
        a.eat();
    }

    public Animal getAnimal() {
        //return new Animal(); Animal不能直接实例化对象
        return new Dog();
    }
}

public class Demo2 {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Dog d = new Dog();
        ao.useAnimal(d);
        Animal a2 = ao.getAnimal();

    }
}
