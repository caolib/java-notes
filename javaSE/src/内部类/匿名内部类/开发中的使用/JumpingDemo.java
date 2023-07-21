package javaSE.src.内部类.匿名内部类.开发中的使用;

public class JumpingDemo {
    public static void main(String[] args) {
        JumpingOperator jo = new JumpingOperator();
        Jumping j = new Cat();
        jo.useJumping(j);

        Jumping j2 = new Dog();
        jo.useJumping(j2);

        System.out.println("----------");
        jo.useJumping(new Jumping() {
            @Override
            public void jump() {
                System.out.println("芜湖起飞");
            }
        });


    }
}
