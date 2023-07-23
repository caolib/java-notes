package javaSE.src.Thread.阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {
    ArrayBlockingQueue<String> queue;

    static int food = 10;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            if (food == 0) {
                break;
            }
            try {
                food--;
                String take = queue.take();
                System.out.println(getName() + "吃" + take + "，还能在吃" + food + "碗");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
