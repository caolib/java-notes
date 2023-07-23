package javaSE.src.Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo implements Runnable {
    private static int tickets = 0;
    static Lock lock = new ReentrantLock();//static保证是同一把锁

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (tickets == 100) {
                    break;
                }
                Thread.sleep(10);
                tickets++;
                System.out.println(Thread.currentThread().getName() + "正在出售第 " + tickets + "张票");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
