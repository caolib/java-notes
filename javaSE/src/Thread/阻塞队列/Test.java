package javaSE.src.Thread.阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        //阻塞队列初始化最大长度为1
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        Cook cook = new Cook(queue);
        Foodie foodie = new Foodie(queue);

        cook.setName("厨子");
        foodie.setName("顾客");
        cook.start();
        foodie.start();
        //打印结果可能不准确，因为输出语句不是在带锁的put和take方法中，而是在外面，所以可能输出可能会有错误，但是数据是正确的
    }
}
