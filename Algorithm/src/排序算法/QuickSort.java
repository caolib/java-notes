package Algorithm.src.排序算法;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class QuickSort {
    public static void main(String[] args) {

        int num = 10000;
        int[] arr = new int[num] ;
        Random r = new Random();
        for (int i = 0; i < num; i++) {
            arr[i] = r.nextInt(100000);
        }

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * <h1 color="#10ac84">快速排序</h1>
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pre = left;//将数组的开始作为交换点

        // 把最后一个数作为基准点
        int pivot = arr[right];
        // 遍历除最后一个数之外的所有数，小于基准数就放到前面
        // 数组变成: [<pivot] + [>=pivot] + pivot
        for (int i = left; i <= right - 1; i++) {//<<<注意这里的right是索引，所以<=right-1而不是<right>>>
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[pre];
                arr[pre] = temp;
                pre++;// ++后，pre的索引就是[>=pivot]的第一个元素的索引
            }
        }
        // 将基准数与[>=基准数]的第一个元素交换位置
        // 数组变成 [<pivot] + pivot + [>=pivot]
        int temp = arr[right];
        arr[right] = arr[pre];
        arr[pre] = temp;

        //基准点索引变成了left
        //递归调用，对左右数组进行快速排序
        quickSort(arr, left, pre - 1);
        quickSort(arr, pre + 1, right);
    }

    @Test
    public void testQuickSort() {
        // Positive Test Case
        int[] arr = {3, 5, 2, 1, 4};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(arr,expected);
        // Negative Test Case
        int[] arr2 = {3, 5, 2, 1, 4};
        QuickSort.quickSort(arr2, 0, arr2.length - 1);
        int[] expected2 = {5, 4, 3, 2, 1};
        assertNotEquals(arr2,expected2);



    }


}
