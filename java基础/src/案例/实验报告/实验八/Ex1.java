package java基础.src.案例.实验报告.实验八;

class MyRunnable implements Runnable {
    private static int tickets = 20;

    public static synchronized void sellTickets() throws InterruptedException {
        if (tickets > 0) {
            Thread.sleep(200);
            System.out.println(Thread.currentThread().getName() + " 售出第 " + (21 - tickets) + " 张票,剩余 " + (tickets - 1) + " 张票");
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

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Thread windows1 = new Thread(new MyRunnable());
        Thread windows2 = new Thread(new MyRunnable());
        Thread windows3 = new Thread(new MyRunnable());

        windows1.setName("窗口1");
        windows2.setName("窗口2");
        windows3.setName("窗口3");

        windows1.start();
        windows2.start();
        windows3.start();

        windows1.join();
        windows2.join();
        windows3.join();

        System.out.println("\n票已售罄!");
    }
}
