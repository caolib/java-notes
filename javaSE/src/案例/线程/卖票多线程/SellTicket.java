package javaSE.src.案例.线程.卖票多线程;

//    1:定义一个类SellTicket实现Runnable接口，里面定义一个成员变量：private int tickets=100;
//    同步的好处：解决了数据安全问题  弊端：运行效率变低

public class SellTicket implements Runnable {
    private static int tickets = 100;
    private Object obj = new Object();
    private int x = 0;

    //同步静态方法
    private static synchronized void sellTickets() {
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + "正在出售第 " + (101 - tickets) + "张票");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            tickets--;
        }

    }

    //     2:在SellTicket类中重写run()方法实现卖票，代码步骤如下
    @Override
    public void run() {
//        A:判断票数大于0，就卖票，并告知是哪个窗口卖的
//        B:卖了票之后，总票数要减1
//        C:票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行
        while (true) {
            /*
                满足下面三个条件会引发数据安全问题
                1、多线程
                2、有共享数据
                3、有多条语句操作共享数据
             */
            //通过同步代码块将多条语句代码锁住，代码块一组一组的运行
            //运行完才能运行下一个代码块

            if (x % 2 == 0) {
//                synchronized (obj) {//这里不能用new，因为必须是同一个
//                synchronized (this) {//这里不能用new，因为必须是同一个
                synchronized (SellTicket.class) {//这里不能用new，因为必须是同一个
                    if (tickets > 0) {
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + (101 - tickets) + "张票");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        tickets--;
                    }
                }
            } else {
                sellTickets();
//                synchronized (obj) {//这里不能用new，因为必须是同一个
//                    if (tickets > 0) {
//                        System.out.println(Thread.currentThread().getName() + "正在出售第" + (101 - tickets) + "张票");
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                        tickets--;
//                    }
//                }
            }


        }


    }
}
