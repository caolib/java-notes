package javaSE.src.案例.运动员与教练;

//教练类
public abstract class Instructor extends Person {
    public Instructor() {
    }

    public Instructor(String name, int age) {
        super(name, age);
    }

    public abstract void teach();

    @Override
    public void eat() {
        System.out.println(this.getName() + "吃坤坤");
    }
}
