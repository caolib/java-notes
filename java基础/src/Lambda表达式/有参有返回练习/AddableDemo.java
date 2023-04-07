package java基础.src.Lambda表达式.有参有返回练习;

public class AddableDemo {
    public static void main(String[] args) {
        Addable a = new Addableimp();
        System.out.println(useAddable(a, 1, 2));

        //匿名内部类
        System.out.println(useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        }, 6, 3));

        //lambda表达式
        System.out.println(useAddable((int x, int y) -> {
            return x + y;
        }, 1, 26));


    }

    public static int useAddable(Addable a, int x, int y) {
        return a.add(x, y);
    }
}

