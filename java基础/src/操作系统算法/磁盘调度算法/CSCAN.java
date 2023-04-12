package java基础.src.操作系统算法.磁盘调度算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CSCAN {
    public static void main(String[] args) {
        int start = 100;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(55, 58, 39, 18, 90, 160, 150, 38, 184));
        arr.add(start);
        printCSCAN(arr, start);

        int start2 = 143;
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(86, 147, 91, 177, 94, 150, 102, 175, 130));
        arr2.add(start2);
        printCSCAN(arr2, start2);
    }

    public static int runCSCAN(ArrayList<Integer> arr, int start) {
        Collections.sort(arr);
        int sum = 0;
        int index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == start) {
                index = i;
            }
        }
        int index2 = index;

        for (int j = index + 1; j < arr.size(); j++) {
            sum += arr.get(j) - arr.get(index);
            index++;
        }

        for (int i = 0; i < index2; i++) {
            sum += Math.abs(arr.get(index) - arr.get(i));
            index = i;
        }
        return sum;
    }

    public static void printCSCAN(ArrayList<Integer> arr, int start) {
        int len = runCSCAN(arr, start);
        System.out.println("\n寻道总长度：" + len);
        System.out.println("平均寻道长度：" + len * 1.0 / (arr.size() - 1) + "\n");
    }
}
