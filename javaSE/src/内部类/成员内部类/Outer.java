package javaSE.src.内部类.成员内部类;

public class Outer {

    private int num = 10;

//    public class Inner {
//        public void show() {
//            System.out.println("num = " + num);
//        }
//    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }

    private class Inner {
        public void show() {
            System.out.println("num = " + num);
        }
    }

}
