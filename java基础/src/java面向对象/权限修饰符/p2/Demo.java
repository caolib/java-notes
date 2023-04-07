package java基础.src.java面向对象.权限修饰符.p2;

import java面向对象.权限修饰符.p1.Fu;

public class Demo {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.show4();

        //不同包中的无关类只能访问public

    }
}
