package javaSE.src.java面向对象.类名作为形参和返回值;

class Cat {
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class CatOperator {
    public void useCat(Cat cat) {
        cat.eat();
    }

    public Cat getCat() {
        return new Cat();
    }
}

public class Demo {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        Cat c = new Cat();
        co.useCat(c);

        Cat c2 = co.getCat();
        c2.eat();

    }
}
