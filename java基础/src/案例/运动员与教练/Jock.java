package java基础.src.案例.运动员与教练;

//运动员类
public abstract class Jock extends Person {
    public Jock() {
    }

    public Jock(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "吃海参");
    }

    public abstract void learn();
}
