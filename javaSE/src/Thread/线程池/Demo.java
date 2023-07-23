package javaSE.src.Thread.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        //1.获取线程池对象(个数上限是int类型最大值，但其实一般创建不了那么多线程，所以相当于无上限)
//        ExecutorService p1 = Executors.newCachedThreadPool();

        ExecutorService p2 = Executors.newFixedThreadPool(3);

        //2.提交任务
        p2.submit(new MyRunnable());
        p2.submit(new MyRunnable());
        p2.submit(new MyRunnable());
        p2.submit(new MyRunnable());
        p2.submit(new MyRunnable());

        //3.销毁线程池
//        pool1.shutdown();


    }
}
