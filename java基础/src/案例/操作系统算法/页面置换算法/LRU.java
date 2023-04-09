package java基础.src.案例.操作系统算法.页面置换算法;

import java.util.ArrayList;

public class LRU {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 5, 6, 2, 1, 2, 3, 7, 6, 3, 2, 1, 2, 3, 6};
        int[] arr2 = {5, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 1, 2, 0, 1, 5, 0, 1};
        printLRU(arr, 3);
        printLRU(arr, 4);
        printLRU(arr2, 3);
        printLRU(arr2, 4);
    }

    public static int runLRU(int[] arr, int len) {
        ArrayList<Integer> lst = new ArrayList<>();
        int hits = 0;
        for (int i : arr) {
            boolean hit = false;
            int index = isInArray(i, lst);
            if (index != -1) {
               /* 如果元素在数组中存在，那么把这个元素放到数组的尾部，
                 这样就最不容易被推出数组，因为此元素最近才访问过,这就是LRU算法*/
                int tar = lst.get(index);
                lst.remove(index);
                lst.add(tar);
                hits++;
                hit = true;
            } else {
                if (lst.size() < len) {
                    lst.add(i);
                } else {
                    //去除头部元素，在尾部添加元素
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

    //判断元素i是否存在于数组中
    public static int isInArray(int i, ArrayList<Integer> lst) {
        int index = -1;
        for (int j = 0; j < lst.size(); j++) {
            if (i == lst.get(j)) {
                return j;
            }
        }
        return index;
    }

    //打印结果
    public static void printLRU(int[] arr, int len) {
        int hits = runLRU(arr, len);
        System.out.println("-----------");
        System.out.println("物理块数:" + len);
        System.out.println("命中次数:" + hits);
        System.out.println("缺页次数:" + (arr.length - hits));
        System.out.println("缺页率:" + 100.0 * (arr.length - hits) / arr.length + "%");
        System.out.println("-----------");
    }
}
