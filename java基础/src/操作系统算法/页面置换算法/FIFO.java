package java基础.src.操作系统算法.页面置换算法;

import java.util.ArrayList;

public class FIFO {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 5, 6, 2, 1, 2, 3, 7, 6, 3, 2, 1, 2, 3, 6};
        int[] arr2 = {5, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 1, 2, 0, 1, 5, 0, 1};
        int[] arr3 = {0, 1, 2, 3, 0, 1, 4, 0, 1, 2, 3, 4};
//        printFIFO(arr, 3);
//        printFIFO(arr, 4);
//        printFIFO(arr2, 3);
        printFIFO(arr3, 3);
        printFIFO(arr3, 4);
    }

    // int[]arr:页面访问序列数组
    // int len:物理块的个数
    // 返回值为命中次数
    public static int runFIFO(int[] arr, int len) {
        ArrayList<Integer> lst = new ArrayList<>();
        int hits = 0;
        for (int i : arr) {
            boolean hit = false;
            if (isInArray(i, lst)) {
                hits++;
                hit = true;
            } else {
                if (lst.size() < len) {
                    lst.add(i);
                } else {
                    //去除数组的头部元素，加入新的元素，这就是先进先出(FIFO)的意思
                    lst.remove(0);
                    lst.add(i);
                }
            }
            System.out.print(i + "| ");
            for (int j = lst.size() - 1; j >= 0; j--) {
                System.out.print(lst.get(j) + " ");
            }
            System.out.println(hit ? "√" : "");
        }
        return hits;
    }

    //判断元素是否存在于数组中
    public static boolean isInArray(int i, ArrayList<Integer> lst) {
        boolean b = false;
        for (int n : lst) {
            if (i == n) {
                b = true;
                break;
            }
        }
        return b;
    }

    //打印结果
    public static void printFIFO(int[] arr, int len) {
        int hits = runFIFO(arr, len);
        System.out.println("-----------");
        System.out.println("物理块数:" + len);
        System.out.println("命中次数:" + hits);
        System.out.println("缺页次数:" + (arr.length - hits));
        System.out.println("缺页率:" + 100.0 * (arr.length - hits) / arr.length + "%");
        System.out.println("-----------");
    }

}
