package javaSE.src.Thread.生产者消费者;

public class Desk {
    //桌子上是否有食物
    static int food = 0;
    //最多吃多少
    static int total = 10;
    //锁对象
    static final Object lock = new Object();
}
