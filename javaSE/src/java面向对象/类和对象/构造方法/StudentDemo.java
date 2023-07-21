package javaSE.src.java面向对象.类和对象.构造方法;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();

        Student s2 = new Student("张三", 66);
        s2.show();

    }
}
