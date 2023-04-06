package 多态.多态的好处和弊端;

//好处：提高了程序的扩展性
//弊端：不能使用子类中特有的功能

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

    public void lookDoor() {
        System.out.println("狗看门");
    }
}

class Pig extends Animal {
    @Override
    public void eat() {
        System.out.println("猪吃白菜");
    }
}

class AnimalOperator {
    /*
        public void useAnimal(Cat cat) { //new Cat()
            cat.eat();
        }
        public void useAnimal(Dog dog) { //new Dog()
            dog.eat();
        }
    */
    //使用多态实现
    public void useAnimal(Animal a) {
        //Animal a = new Cat();
        a.eat();
//        a.lookDoor();     不能使用子类特有的方法，必须是父类中有的
    }

}

public class Demo {
    public static void main(String[] args) {
        Cat c = new Cat();
        //创建动物操作类对象，调用方法
        AnimalOperator ao = new AnimalOperator();
        ao.useAnimal(c);

        Dog d = new Dog();
        ao.useAnimal(d);

        Pig p = new Pig();
        ao.useAnimal(p);

    }
}
