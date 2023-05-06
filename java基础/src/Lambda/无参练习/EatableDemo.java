package java基础.src.Lambda.无参练习;

import java.util.function.Function;

/*
    Lambda表达式的格式：（形式参数）->{代码块}
    练习1：
    1:定义一个接口(Eatable),里面定义一个抽象方法：void eat();
    2:定义一个测试类(EatableDemo),在测试类中提供两个方法
    一个方法是：useEatable(Eatable e)
    一个方法是主方法，在主方法中调用useEatable方法

    使用情况：
    有一个接口，只定义了一个抽象方法，可以用lambda表达式直接使用该方法
 */
public class EatableDemo {
    public static void main(String[] args) {
//        Eatable e = new Eatableimp();
//        useEatable(e);

        //匿名内部类实现
//        useEatable(new Eatable() {
//            @Override
//            public void eat() {
//                System.out.println("吃饭");
//            }
//        });

        //lambda表达式
        useEatable(() -> {
            System.out.println("吃饭");
        });


        int x = 0;
        Eatable a = () -> System.out.println(x);
        a.eat();

        Function<Integer, Integer> func = (n) -> n * n;
        System.out.println(func.apply(10));

    }

    public static void useEatable(Eatable e) {
        e.eat();
    }
}
