package javaSE.src.Case.集合;

import java.util.Comparator;
import java.util.TreeSet;

/*
    用TreeSet集合存储学生信息，并按照总分大小进行排序，
    总分相同则按照语文成绩排序，还相同则按照名字排序
 */
class Person {
    String name;
    int mathGrade;
    int ChineseGrade;

    public Person(String name, int mg, int cg) {
        this.name = name;
        mathGrade = mg;
        ChineseGrade = cg;
    }

    public int getGrade() {
        return mathGrade + ChineseGrade;
    }

    public void show() {
        System.out.println(name + " 语文：" + ChineseGrade + " 数学：" + mathGrade);
    }
}

public class 成绩排序 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int num = p2.getGrade() - p1.getGrade();
                int num2 = num == 0 ? p2.ChineseGrade - p1.ChineseGrade : num;
                return num2 == 0 ? p1.name.compareTo(p2.name) : num2;
            }
        });

        Person p1 = new Person("Rick", 100, 100);
        Person p2 = new Person("Morty", 50, 50);
        Person p3 = new Person("Saber", 70, 30);
        Person p4 = new Person("Archer", 70, 30);
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        for (Person p : ts) {
            p.show();
        }


    }
}
