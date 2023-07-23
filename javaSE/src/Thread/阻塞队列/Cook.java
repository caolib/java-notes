package javaSE.src.Thread.阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {
    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            if (Foodie.food == 0) {
                break;
            }
            try {
                String food = "面条";
                queue.put(food);
                System.out.println(getName() + "做好了" + food);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
