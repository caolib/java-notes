package java基础.src.线程Thread.Runnable接口实现多线程;

/*
    方式2：实现Runnable接口
    1:定义一个类MyRunnable实现Runnable接口
    2:在myRunnable类中重写run()方法
    3:创建MyRunnable类的对象
    4:创建Thread类的对象，把MyRunnable对象作为构造方法的参数
    5:启动线程
 */

public class MyRunnableDemo {
    public static void main(String[] args) {
        //创建MyRunnable对象
        MyRunnable mr = new MyRunnable();

        //创建Thread对象，把MyRunnable对象作为构造方法的参数
        //Thread(Runnable target)
//        Thread t1 = new Thread(mr);     //MyRunnable实现了Runnable接口
//        Thread t2 = new Thread(mr);
        //Thread(Runnable target, String name) 分配新的 Thread对象
        Thread t1 = new Thread(mr, "高铁");
        Thread t2 = new Thread(mr, "飞机");

        //启动线程
        t1.start();
        t2.start();

    }
}
