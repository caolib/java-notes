package javaSE.src.Thread.Thread;

/*
    方式l:继承Thread类
    1:定义一个类My Thread继承Thread类
    2:在MyThread类中重写run()方法
    3:创建MyThread.类的对象
    4:启动线程
 */

public class Demo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        //run方法并没有执行线程,相当于普通方法的调用
//        my1.run();
//        my2.run();

        //void start() 导致此线程的开始执行，Java虚拟机调用此线程的run方法
        my1.start();
        my2.start();

    }
}
