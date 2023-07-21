package javaSE.src.java面向对象.类和对象.构造方法;

public class Student {
    String name;
    int age;

    //构造方法
    public Student() {
    }      //无参构造

    public Student(String name, int age) {      //有参构造
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}

//注意事项
//如果未提供构造方法，系统将提供一个默认的无参构造方法
//如果提供了构造方法，系统不再提供任何构造方法，无参构造也要自己实现