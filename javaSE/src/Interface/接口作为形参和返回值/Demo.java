package javaSE.src.Interface.接口作为形参和返回值;

interface Jumping {
    void jump();
}

class Cat implements Jumping {
    @Override
    public void jump() {
        System.out.println("猫跳高");
    }
}

class JumpingOperator {
    public void useJumping(Jumping jumping) {
        jumping.jump();
    }

    public Jumping getJumping() {
        return new Cat();   //接口不能实例化，所以返回接口的实现类的对象
    }
}

public class Demo {
    public static void main(String[] args) {
        JumpingOperator jo = new JumpingOperator();
        Jumping c = new Cat();
        jo.useJumping(c);

        Jumping j2 = jo.getJumping();
        j2.jump();

    }
}
