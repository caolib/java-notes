package java面向对象.类和对象.private关键字;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(20);
        System.out.println("姓名：" + s.getName() + " 年龄：" + s.getAge());
    }
}
