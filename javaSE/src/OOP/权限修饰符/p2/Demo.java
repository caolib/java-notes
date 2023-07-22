package javaSE.src.OOP.权限修饰符.p2;

import javaSE.src.OOP.权限修饰符.p1.Fu;

public class Demo {
    public static void main(String[] args) {
        //不同包中的无关类只能访问public
        Fu fu = new Fu();
        fu.show4();


    }
}
