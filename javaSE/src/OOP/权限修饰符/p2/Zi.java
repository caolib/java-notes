package javaSE.src.OOP.权限修饰符.p2;

import javaSE.src.OOP.权限修饰符.p1.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show3();
        z.show4();

        //不同包中的子类只能访问public和protected

    }
}
