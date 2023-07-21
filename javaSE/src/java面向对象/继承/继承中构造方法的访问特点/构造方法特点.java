package javaSE.src.java面向对象.继承.继承中构造方法的访问特点;

class Fu {
    public int age;

    public Fu() {
        System.out.println("Fu无参构造方法的调用");
    }

    public Fu(int age) {
        System.out.println("Fu有参构造方法的调用");
    }
}

class Zi extends Fu {

    public Zi() {
//        super();    //父类调用无参构造方法
        System.out.println("Zi无参构造方法的调用");
    }

    public Zi(int age) {
        super(20);
        this.age = age;
        System.out.println("Zi有参构造方法的调用");
    }
}

public class 构造方法特点 {
    public static void main(String[] args) {
        //创建方法
        Zi z = new Zi();
        Zi z2 = new Zi(1);
        System.out.println(z2.age);
    }
}

//子类调用构造方法时，首先会调用父类的构造方法，且默认是无参构造方法
//所以子类的构造方法的第一句写父类的构造方法,即调用super(参数/无参)
//因为子类初始化前一定要先初始化父类