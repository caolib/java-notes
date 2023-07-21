package javaSE.src.java面向对象.继承.继承中变量的访问特点;

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
        System.out.println("height = " + height);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();

    }
}
