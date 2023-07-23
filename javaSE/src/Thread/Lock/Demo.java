package javaSE.src.Thread.Lock;

public class Demo {
    public static void main(String[] args) {
        Runnable m = new LockDemo();

        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
