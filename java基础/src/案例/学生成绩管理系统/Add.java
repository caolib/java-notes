package 案例.学生成绩管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class Add {
    private Add() {
    }

    public static void add(ArrayList<Student> stuArr) {
        Student stu = new Student();
        System.out.println("name：");
        Scanner sc = new Scanner(System.in);
        stu.setName(sc.nextLine());
        System.out.println("age：");
        stu.setAge(sc.nextInt());
        System.out.println("courseNum：");
        int n = sc.nextInt();
        ArrayList<Course> cou = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Scanner sc2 = new Scanner(System.in);
            Course c = new Course();
            System.out.println("name：");
            String name = sc2.nextLine();
            c.setName(name);
            System.out.println("id：");
            int id = sc2.nextInt();
            c.setID(id);
            System.out.println("score：");
            double g = sc2.nextDouble();
            c.setGrade(g);
            System.out.println("credit：");
            double credit = sc2.nextDouble();
            c.setCredit(credit);
            cou.add(c);
        }
        stu.setCourse(cou);
        stuArr.add(stu);
        System.out.println("\nsucceed\n");
    }
}
