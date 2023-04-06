package Lambda表达式.省略模式;

public class Demo {
    public static void main(String[] args) {
        System.out.println(useAdd((int x, int y) -> {
            return x + y;
        }, 1, 2));

        //参数类型可以省略 要么全省略要么全不省略
        System.out.println(useAdd((x, y) -> x + y, 1, 2));

//        useFly((String s) -> {
//            System.out.println(s + "起飞");
//        });

        //参数只有一个() 可以省略
        //执行语句只有一条 {;}可以省略,如果有return，return也要省略
        useFly(s -> System.out.println(s + "起飞"));

    }

    private static void useFly(Flyable flyable) {
        flyable.fly("芜湖");
    }

    private static int useAdd(Addable a, int x, int y) {
        return a.add(x, y);
    }
}
