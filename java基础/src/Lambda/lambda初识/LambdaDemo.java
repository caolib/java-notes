package java基础.src.Lambda.lambda初识;

public class LambdaDemo {
    public static void main(String[] args) {
        //实现类方式实现需求
//        MyRunnable my = new MyRunnable();
//        Thread t = new Thread(my);
//        t.start();

        //匿名内部类方式改进
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程启动");
//            }
//        }).start();

        //lambda表达式改进
        new Thread(() -> {
            System.out.println("多线程启动");
        }).start();

    }
}
