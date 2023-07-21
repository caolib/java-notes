package javaSE.src.Thread.线程控制;

public class ThreadDaemon extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
        System.out.println(this.getName() + " 执行完成");
    }
}
