package java基础.src.Lambda表达式.有参练习;

public class FlyableDemo {
    public static void main(String[] args) {
        //实现类方法实现
        Flyable f = new Flyableimp();
        useFlyable(f);

        //匿名内部类方法实现
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s + "起飞");
            }
        });

        //lambda表达式实现
        useFlyable((String s) -> {
            System.out.println(s + "起飞");
        });

    }

    public static void useFlyable(Flyable f) {
        f.fly("芜湖");
    }
}
