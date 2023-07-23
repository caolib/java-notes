package javaSE.src.Thread.生产者消费者;

public class Cook extends Thread {
    @Override
    public void run() {
        while (true) {
            if (Desk.total == 0) {
                break;
            }
            try {
                make();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void make() throws InterruptedException {
        synchronized (Desk.lock) {
            if (Desk.food == 1) {
                Desk.lock.wait();//等待顾客吃完食物
            } else {
                System.out.println("厨师正在做食物");
                Desk.food++;
                Desk.lock.notifyAll();//叫醒顾客吃
            }

        }
    }
}
