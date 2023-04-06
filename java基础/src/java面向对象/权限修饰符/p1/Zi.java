package java面向对象.权限修饰符.p1;

public class Zi extends Fu {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show2();
        z.show3();
        z.show4();

        //同一个包中的子类中，只有private不能访问

    }
}
