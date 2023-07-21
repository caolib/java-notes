package javaSE.src.Thread.线程控制;

/*
    void join() 等待这个线程死亡
 */

public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();
        tj1.setName("康熙");
        tj2.setName("四阿哥");
        tj3.setName("八阿哥");

        tj1.start();
        //tj1执行完后 tj2和tj3才开始执行并争夺cpu(康熙死后，他俩开始争夺王位)
        try {
            tj1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        tj2.start();
        tj3.start();

    }
}
