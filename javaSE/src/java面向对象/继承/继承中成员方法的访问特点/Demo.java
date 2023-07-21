package javaSE.src.java面向对象.继承.继承中成员方法的访问特点;

class Fu {
    public void show() {
        System.out.println("Fu中show方法的调用");
    }
}

class Zi extends Fu {
    public void method() {
        System.out.println("Zi类中method方法的调用");
    }

    public void show() {
        System.out.println("Zi中show方法的调用");
    }
}

public class Demo {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
        z.show();
    }
}
