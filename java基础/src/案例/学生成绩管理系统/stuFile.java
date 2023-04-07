package java基础.src.案例.学生成绩管理系统;

import java.io.*;
import java.util.ArrayList;

public class stuFile {
    private stuFile() {
    }

    public static void writeFile(ArrayList<Student> stuArr) throws IOException {
        BufferedWriter fw = new BufferedWriter(new FileWriter("src/案例/学生成绩管理系统/stuFile.txt"));
        fw.write(String.valueOf(stuArr.size()));
        fw.newLine();
        for (Student s : stuArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(" ").append(s.getAge()).append(" ").append(s.course.size()).append(" ");
            for (Course c : s.course) {
                sb.append(c.getName()).append(" ").append(c.getID()).append(" ").append(c.getGrade()).append(" ").append(c.getCredit()).append(" ");
            }
            fw.write(sb.toString());
            fw.newLine();
        }
        fw.close();
    }
    /*
        for (Student stu : stuArr) {
            fw.write(stu.getName() + " ");
            fw.write(stu.getAge() + " ");
            fw.write(stu.course.size() + " ");
            for (Course c : stu.course) {
                fw.write(c.getName() + " ");
                fw.write(c.getID() + " ");
                fw.write(c.getGrade() + " ");
                fw.write(c.getCredit() + " ");
            }
            fw.write("\n");
        }
     */


    public static void readFile(ArrayList<Student> stuArr) throws IOException {
        File file = new File("src/案例/学生成绩管理系统/stuFile.txt");
        if (!file.exists()) {
            return;
        }
        BufferedReader br = new BufferedReader(new FileReader("src/案例/学生成绩管理系统/stuFile.txt"));
        String str;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            Student s = new Student();
            str = br.readLine();
            String[] strs = str.split(" ");
            s.setName(strs[0]);
            s.setAge(Integer.parseInt(strs[1]));
            int m = Integer.parseInt(strs[2]);
            int k = 3;
            ArrayList<Course> cou = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                Course c = new Course();
                c.setName(strs[k]);
                c.setID(Integer.parseInt(strs[k + 1]));
                c.setGrade(Double.parseDouble(strs[k + 2]));
                c.setCredit(Double.parseDouble(strs[k + 3]));
                k += 4;
                cou.add(c);
            }
            s.setCourse(cou);
            stuArr.add(s);
        }
        br.close();

    }

}
