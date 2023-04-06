package 案例.学生成绩管理系统;

import java.util.ArrayList;

//学生类
public class Student {
    ArrayList<Course> course = new ArrayList<>();
    private String name;//姓名
    private int age;//年龄

    public void display() {
        System.out.println(name);
        System.out.println(age);
        if (course == null) {
            System.out.println("nothing");
        } else {
            for (Course c : course) {
                System.out.println(c.getName() + " ");
                System.out.print(c.getID() + " ");
                System.out.print(c.getGrade() + "　");
                System.out.print(c.getCredit());
            }
        }

        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
