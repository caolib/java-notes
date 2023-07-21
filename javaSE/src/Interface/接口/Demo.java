package javaSE.src.Interface.接口;

//定义了一个接口，接口是抽象的
interface Jumpping {
    void jump();
}

//类与接口之间不用继承，而用implements(实现)
class Cat implements Jumpping {
    @Override
    public void jump() {
        System.out.println("猫跳高");
    }
}

//类要么实现接口，要么自己成为抽象类
abstract class Dog implements Jumpping {
}

public class Demo {
    public static void main(String[] args) {
//        Jumpping j = new Jumpping(); 接口不能直接创建对象，因为是抽象的
        //使用接口多态，用实现类创建对象
        Jumpping j = new Cat();
        j.jump();

        Jumpping j2 = () -> System.out.println("lambda表达式实现接口方法");
        j2.jump();

    }
}
