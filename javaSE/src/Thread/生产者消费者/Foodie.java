package javaSE.src.Thread.生产者消费者;

public class Foodie extends Thread {
    @Override
    public void run() {
        while (true) {
            if (Desk.total == 0) {
                break;
            }
            try {
                eat();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void eat() throws InterruptedException {
        synchronized (Desk.lock) {
            if (Desk.food == 0) {
                Desk.lock.wait();//等待食物
            } else {
                Desk.total--;
                Desk.food--;
                System.out.println("消费者在吃了，还能在吃" + Desk.total + "碗");
                Desk.lock.notifyAll();//吃完叫醒厨师继续做食物
            }

        }
    }

}
