package java基础.src.案例.线程;

class SynThread implements Runnable{
    private static int tickets = 100;

    public static synchronized void sellTickets() throws InterruptedException {
        if (tickets > 0) {
            Thread.sleep(300);
            System.out.println(Thread.currentThread().getName() + "->第 " + (101-tickets) + " 张票");
            tickets--;
        }
    }

    @Override
    public void run() {
        while (tickets > 0) {
            try {
                sellTickets();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Thread临界资源 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new SynThread());
        Thread t2 = new Thread(new SynThread());
        Thread t3 = new Thread(new SynThread());

        t1.setName("主窗口");
        t2.setName("窗口1");
        t3.setName("窗口2");

        //主窗口优先级更高，售票机会更多
        t1.setPriority(6);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("票已售罄");

    }
}
