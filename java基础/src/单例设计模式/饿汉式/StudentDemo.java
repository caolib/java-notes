package java基础.src.单例设计模式.饿汉式;

public class StudentDemo {
    public static void main(String[] args) {
/*        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1 == s2);*/

        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();
        System.out.println(s1 == s2);

        System.out.println(s1);
        System.out.println(s2);
        
    }
}
