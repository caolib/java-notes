package Algorithm.src.排序算法;

import java.util.Arrays;
import java.util.Random;

public class CountSort {
    public static void main(String[] args) {

        int num = 1000;
        int[] arr = new int[num];
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            int val = rand.nextInt(10);
            arr[i] = val;
        }
        int[] arr2 = arr;

        countSort(arr);
        Arrays.sort(arr2);

        assert (arr == arr2);

    }


    /**
     * <h1 color="#10ac84">计数排序</h1>
     * <h2>一般用于小范围非负数排序</h2>
     * */
    public static void countSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        //遍历数组找出最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //定义一个长度为max+1的计数数组，确保待排序数组中所有数都能映射到此数组中
        int[] count = new int[max + 1];
        //遍历待排序数组进行计数
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //通过计数数组构建有序序列
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                //i是待排序数组的元素，count[i]是出现的次数
                arr[j++] = i;
                count[i]--;
            }
        }

    }
}
