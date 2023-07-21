package javaSE.src.API.Set集合.HastSet集合;

import java.util.HashSet;
import java.util.Objects;

public class Reload {
    public static void main(String[] args) {
        //使用hashset添加自定义类对象，如果对象属性完全相同则认为是同一个对象
        HashSet<Student> hashSet = new HashSet<>();

        hashSet.add(new Student("张三", 20));
        hashSet.add(new Student("李四", 21));
        hashSet.add(new Student("王五", 22));
        hashSet.add(new Student("张三", 20));

        hashSet.forEach(System.out::println);

    }
}


class Student {
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}