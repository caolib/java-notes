package 单例设计模式.饿汉式;

/**
 * 饿汉式：类一加载就创建对象
 */

public class Student {
    //成员位置创建对象,private final是为了防止外界访问和修改
    private final static Student s = new Student();

    //构造方法方法私有
    private Student() {
    }

    //通过公共方法提供访问(为了能直接在外部访问，成员s和get方法都要加上static)
    public static Student getStudent() {
        return s;
    }

}
