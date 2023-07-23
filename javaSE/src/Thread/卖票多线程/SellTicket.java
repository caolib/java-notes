package javaSE.src.Thread.卖票多线程;

/*
    满足下面三个条件会引发数据安全问题
    1、多线程
    2、有共享数据
    3、有多条语句操作共享数据
 */
//通过同步代码块将多条语句代码锁住，代码块一组一组的运行
//使用同步方法解决线程安全问题
//运行完才能运行下一个代码块
//同步的好处：解决了数据安全问题  弊端：运行效率变低

public class SellTicket implements Runnable {
    private static int tickets = 100;

    //同步静态方法,方法中所有代码是锁起来的
    private synchronized void sellTickets() {
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + "正在出售第 " + (101 - tickets) + "张票");
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            tickets--;
        }

    }

    //2:在SellTicket类中重写run()方法实现卖票，代码步骤如下
    //A:判断票数大于0，就卖票，并告知是哪个窗口卖的
    //B:卖了票之后，总票数要减1
    //C:票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行
    @Override
    public void run() {
        while (tickets > 0) {
            sellTickets();//此方法已经加了锁，所以代码块不必再加锁
        }
    }

}
