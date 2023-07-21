package javaSE.src.操作系统算法.磁盘调度算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class SSTF {
    public static void main(String[] args) {
        int start = 100;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(55, 58, 39, 18, 90, 160, 150, 38, 184));
        printSSTF(start, arr, arr.size());

        int start2 = 143;
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(86, 147, 91, 177, 94, 150, 102, 175, 130));
        printSSTF(start2, arr2, arr2.size());

    }

    public static int runSSTF(int start, ArrayList<Integer> arr) {
        int sum = 0;
        while (arr.size() >= 1) {
            int index = latest(arr, start);
            int value = arr.get(index);
            System.out.print(value + " ");
            sum += Math.abs(value - start);
            start = value;
            arr.remove(index);
        }
        return sum;
    }

    public static int latest(ArrayList<Integer> arr, int num) {
        // 使用TreeMap得到这个数字与数组中所有元素的距离作为key，索引作为value，
        // TreeMap可以自动排序，所以只要获取第一个元素的value就是
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.size(); i++) {
            treeMap.put(Math.abs(num - arr.get(i)), i);
        }
        return treeMap.firstEntry().getValue();
    }

    public static void printSSTF(int start, ArrayList<Integer> arr, int size) {
        int len = runSSTF(start, arr);
        System.out.println("\n寻道总长度：" + len);
        System.out.println("平均寻道长度：" + len * 1.0 / size + "\n");
    }
}
