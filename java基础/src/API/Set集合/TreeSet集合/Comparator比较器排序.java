package API.Set集合.TreeSet集合;

import java.util.Comparator;
import java.util.TreeSet;


public class Comparator比较器排序 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.age - s2.age;
                return num == 0 ? s1.name.compareTo(s2.name) : num;
            }
        });
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
