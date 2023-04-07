package java基础.src.API.Set集合.TreeSet集合;

//按照年龄大小从小到大排序，年龄相同时按照名字字母排序

import java.util.TreeSet;

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    public void show() {
        System.out.println(name + "," + age);
    }

    @Override
    public int compareTo(Student s) {
//        return 0;
//        return 1;
//        return -1;
//        return s.age - this.age; //按照年龄降序
        int num = this.age - s.age;
        //年龄相同时按照年龄排序
        return num == 0 ? this.name.compareTo(s.name) : num;
    }
}


public class Comparable自然排序 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("zs", 10);
        Student s2 = new Student("ls", 20);
        Student s3 = new Student("ww", 30);
        Student s4 = new Student("cxk", 40);
        Student s5 = new Student("cxc", 40);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student s : ts) {
            s.show();
        }


    }
}
