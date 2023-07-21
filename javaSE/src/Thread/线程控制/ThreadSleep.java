package javaSE.src.Thread.线程控制;

public class ThreadSleep extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            //每执行一次暂停1秒
            try {
                Thread.sleep(1000);//1000ms
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
