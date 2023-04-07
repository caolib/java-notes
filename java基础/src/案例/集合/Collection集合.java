package java基础.src.案例.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection集合 {
    public static void main(String[] args) {
        //存储学生对象并遍历
        Collection<Student> c = new ArrayList<Student>();
        Student s1 = new Student("zs", 12);
        Student s2 = new Student("ls", 23);
        Student s3 = new Student("ww", 34);
        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();
        while (it.hasNext()) {
            it.next().show();
        }

//        for (Iterator<Student> it = c.iterator(); it.hasNext(); ) {
//            it.next().show();
//        }

    }
}
