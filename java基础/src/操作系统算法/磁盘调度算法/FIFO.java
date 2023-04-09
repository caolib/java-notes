package java基础.src.操作系统算法.磁盘调度算法;

public class FIFO {
    public static void main(String[] args) {
/*        int start = 100;
        int[] arr = {55, 58, 39, 18, 90, 160, 150, 38, 184};
        printFIFO(start, arr);*/

        int start2 = 143;
        int[] arr2 = {86, 147, 91, 177, 94, 150, 102, 175, 130};
        printFIFO(start2, arr2);

    }


    /**
     * <h2 color="aqua">磁盘调度算法：先来先服务</h2>
     * <ul color="aqua">
     *     <li>start:开始时磁头所在位置</li>
     *     <li>arr:请求序列</li>
     *     <li>num:返回值为总寻道长度</li>
     * </ul>
     */
    public static int runFIFO(int start, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += Math.abs(arr[i] - arr[i + 1]);
        }
        sum += Math.abs(start - arr[0]);
        return sum;
    }

    //打印输出结果
    public static void printFIFO(int start, int[] arr) {
        System.out.println("寻道总长度：" + runFIFO(start, arr));
        System.out.println("平均寻道长度：" + runFIFO(start, arr) * 1.0 / arr.length);
    }
}
