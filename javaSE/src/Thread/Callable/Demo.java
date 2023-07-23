package javaSE.src.Thread.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Callable接口实现多线程
 * <ol>
 *   <li>创建一个类MyCallable实现Callable接口</li>
 *   <li>重写call方法 -> 有返回值，泛型类型表示call方法返回值类型</li>
 *   <li>创建MyCallable对象 -> 表示线程要执行的任务</li>
 *   <li>创建FutureTask对象 -> 管理运行的结果</li>
 *   <li>创建Thread对象并启动 -> 线程</li>
 * </ol>
 */


public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建MyCallable对象 -> 表示线程要执行的任务
        MyCallable mc = new MyCallable();
        //创建FutureTask对象 -> 管理运行的结果
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //创建Thread对象并启动 -> 线程
        Thread t = new Thread(ft);
        t.start();

        //获取线程运行的结果
        Integer result = ft.get();
        System.out.println(result);

    }
}
