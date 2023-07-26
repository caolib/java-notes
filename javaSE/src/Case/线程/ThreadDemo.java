package javaSE.src.Case.线程;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + ":" + i);
        }
        System.out.println(this.getName() + "执行结束-------------------");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("线程2：" + i);
        }
        System.out.println("线程执行结束------------------");
    }
}

/**
 * 当前的主线程就是main函数
 * main函数和两个Thread并发执行
 * 主线程执行完后，守护线程也会很快结束（不是立刻结束）
 */


public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new MyThread();
        t1.setName("线程1");
        Thread t2 = new Thread(new MyRunnable());
        t2.setName("线程2");

        //将t1,t2设置为守护线程
        t1.setDaemon(true);
        t2.setDaemon(true);

        //开始执行
        t1.start();
        t2.start();
        t1.join();//，此处程序阻塞，知道线程t1执行完成，程序才继续往下执行

        //设置当前主线程name
        Thread.currentThread().setName("主线程main");

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        System.out.println("主线程执行结束-------------------");
        //运行到这里代表主程序已经结束，但是其他线程还在运行，如果全部都是守护线程，那么程序很快就会退出

    }
}
