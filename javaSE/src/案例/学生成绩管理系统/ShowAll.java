package javaSE.src.案例.学生成绩管理系统;

import java.util.ArrayList;

public class ShowAll {
    private ShowAll() {
    }

    public static void showAll(ArrayList<Student> stuArr) {
        if (stuArr.isEmpty()) {
            System.out.println("nothing");
        } else {
            for (Student s : stuArr) {
                s.display();
            }
        }
        System.out.println();
    }

}
