package 单例设计模式.懒汉式;

/**
 * 懒汉式：用的时候才去创建对象
 * 开发过程中使用饿汉式，因为不会产生线程安全问题
 */

public class Teacher {
    private static Teacher t = null;

    private Teacher() {
    }

    //synchronized 加锁，防止产生线程安全问题
    public synchronized static Teacher getTeacher() {
        if (t == null) {
            t = new Teacher();
        }
        return t;
    }


}
