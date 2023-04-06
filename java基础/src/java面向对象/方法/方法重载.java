package java面向对象.方法;

public class 方法重载 {
    public static void main(String[] args) {
        //方法重载：
        //同一个类中有多个相同方法名的方法，方法的参数不同(类型不同/数量不同/数量类型都不同)
        //注意:不能仅凭返回值类型不同构成重载，即不能通过返回值判断是否能构成重载
        System.out.println(getSum(1, 2));
        System.out.println(getSum(1, 2, 3));

    }

    public static int getSum(int n1, int n2) {
        return n1 + n2;
    }

    public static int getSum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

}
