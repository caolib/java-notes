package java基础.src.java面向对象.权限修饰符.p1;

public class Fu {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.show1();
        f.show2();
        f.show3();
        f.show4();

        //在自己类中，所有权限下的都可以访问

    }

    private void show1() {
        System.out.println("private");
    }

    void show2() {
        System.out.println("默认");
    }

    protected void show3() {
        System.out.println("protected");
    }

    public void show4() {
        System.out.println("public");
    }
}