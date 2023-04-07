package java基础.src.案例.操作系统算法;

class Process {
    int create;
    int runTime;
    int finish;

    public void setFinish(int finish) {
        this.finish = finish;
    }

    public Process(int create, int runTime) {
        this.create = create;
        this.runTime = runTime;
    }
}

public class FCFS {
    public static void main(String[] args) {
        Process[] processes = {
                new Process(4, 4),
                new Process(0, 3),
                new Process(6, 5),
                new Process(2, 6),
                new Process(8, 2)};

    }

    public static void runFCFS(Process[] processes) {
        int now = 0;

    }


}
