package javaSE.src.Case.普通案例;

class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

}

class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMice() {
        System.out.println(this.getName() + "抓老鼠");
    }
}

class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void janitor() {
        System.out.println(this.getName() + "看门");
    }

}

public class 猫和狗_继承 {
    public static void main(String[] args) {
        Dog d = new Dog("狗子", 6);
        d.show();
        d.janitor();

        System.out.println("-----");
        Cat c = new Cat();
        c.setName("黑猫");
        c.setAge(3);
        c.show();
        c.catchMice();
    }
}
