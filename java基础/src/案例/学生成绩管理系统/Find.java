package java基础.src.案例.学生成绩管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class Find {
    private Find() {
    }

    public static void find(ArrayList<Student> stuArr) {
        int len = stuArr.size();
        if (len == 0) {
            System.out.println("Nothing");
        }
        while (true) {
            System.out.println("1-find");
            System.out.println("2-back");
            Scanner sc = new Scanner(System.in);
            String sel = sc.nextLine();
            if (sel.equals("1")) {
                System.out.println("name:");
                String name = sc.nextLine();
                for (Student stu : stuArr) {
                    if (stu.getName().equals(name)) {
                        stu.display();
                        break;
                    }
                }
                if (len == stuArr.size()) {
                    System.out.println("no such person!");
                }
            } else if (sel.equals("2")) {
                break;
            } else {
                System.out.println("input error!");
            }

        }
    }
}