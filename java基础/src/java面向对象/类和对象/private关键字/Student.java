package java面向对象.类和对象.private关键字;

public class Student {
    private String name;    //private修饰，只能在类内访问
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    //提供set和get方法以便在类外访问
    public void setName(String name) {
        this.name = name;
    }


}
