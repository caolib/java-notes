package java基础.src.Lambda表达式.lambda初识;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("多线程启动");
    }
}
