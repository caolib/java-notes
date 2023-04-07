package java基础.src.线程Thread.线程控制;

/*
    void setDaemon(boolean on):将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出
    主线程执行完后，守护线程很快也会停止执行（不是立刻停止，刘备死后，关羽和张飞也很快死了）
 */

public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();
        td1.setName("关羽");
        td2.setName("张飞");

        //设置主线程刘备
        Thread.currentThread().setName("刘备");

        //设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();
        //刘备的执行线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

    }
}
