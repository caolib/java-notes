package java基础.src.案例.学生成绩管理系统;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> stuArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        stuFile.readFile(stuArr);
        label:
        while (true) {
            Menu.showMenu();
            String select;
            select = sc.nextLine();
            switch (select) {
                case "1":
                    Add.add(stuArr);
                    break;
                case "2":
                    Delete.delete(stuArr);
                    break;
                case "3":
                    Find.find(stuArr);
                    break;
                case "4":
                    ShowAll.showAll(stuArr);
                    break;
                case "0":
                    stuFile.writeFile(stuArr);
                    break label;
                default:
                    System.out.println("input error！");
                    break;
            }
        }

    }
}
