package javaSE.src.Thread.线程优先级;

/*
    Thread类中设置和获取线程优先级的方法
    public final void setpriority(int newPriority):更改此线程的优先级
    public final int getpriority():返回此线程的优先级
 */

public class Demo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");

        //    public final int getpriority():返回此线程的优先级
//        System.out.println(tp1.getPriority());//5
//        System.out.println(tp2.getPriority());//5
//        System.out.println(tp3.getPriority());//5

//        tp1.setPriority(10000);//IllegalArgumentException 超出优先级的范围

        System.out.println("线程优先级最小为：" + Thread.MIN_PRIORITY);
        System.out.println("线程优先级最大为：" + Thread.MAX_PRIORITY);
        System.out.println("线程默认优先级为：" + Thread.NORM_PRIORITY);

        //设置正确的优先级
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();

        //线程优先级高仅表示获取cpu时间片的几率高，在次数比较多或多次运行时才能看到你想要的效果


    }
}
