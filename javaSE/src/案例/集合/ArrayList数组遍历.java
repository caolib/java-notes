package javaSE.src.案例.集合;

import java.util.ArrayList;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class ArrayList数组遍历 {
    public static void main(String[] args) {
        //遍历数组
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        //遍历学生对象数组
        Student s1 = new Student("张三", 19);
        Student s2 = new Student("李四", 30);
        Student s3 = new Student("王五", 23);

        ArrayList<Student> stuarr = new ArrayList<>();
        stuarr.add(s1);
        stuarr.add(s2);
        stuarr.add(s3);

        for (int i = 0; i < stuarr.size(); i++) {
            stuarr.get(i).show();
        }

    }
}

