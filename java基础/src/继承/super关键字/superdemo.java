package java基础.src.继承.super关键字;

class Fu {
    public int age = 40;
}

class Zi extends Fu {
    public int height = 175;
    public int age = 20;

    public void show() {
        int age = 69;
        //就近原则，存在3个age，使用最近那个age的值
        System.out.println("age = " + age);
        //如何访问子类本身的age >>>this
        System.out.println("this.age = " + this.age);
        //如何访问父类中的age >>>super关键字 用法与this相似
        System.out.println("super.age = " + super.age);

        System.out.println("height = " + height);
    }
}

public class superdemo {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();

    }
}