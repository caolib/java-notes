package java基础.src.java面向对象.static关键字;

class Student {
    //被static修饰的 变量 或 方法 为该类的 所有对象 所共有，
    // 推荐使用类名进行访问(也可以通过对象访问)
    //静态成员方法只能访问静态成员变量
    //非静态成员方法可以访问静态和非静态成员
    public static String country;
    public String name;
    public int age;

    public void show() {
        System.out.println(name + " " + age + " " + country);
    }

}

public class Demo {
    public static void main(String[] args) {
        Student.country = "中国";
        Student s1 = new Student();
        s1.name = "坤坤";
        s1.age = 30;
//        s1.country = "中国";
        s1.show();

        Student s2 = new Student();
        s2.name = "张三";
        s2.age = 19;
//        s2.country = "中国";
        s2.show();


    }
}
