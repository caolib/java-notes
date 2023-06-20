package java基础.src.Lambda.lambda初识;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("多线程启动");
    }
}
