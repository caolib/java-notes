package Algorithm.src.排序算法;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortStack {
    public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());
        int num = 100000;
        int[] arr = new int[num];
        int[] arr2 = new int[num];

        for (int i = 0; i < num; i++) {
            int val = rand.nextInt(1000000);
            arr[i] = val;
            arr2[i] = val;
        }
        Arrays.sort(arr2);
        quickSort_stack(arr);
        assertArrayEquals(arr, arr2);

    }

    public static void quickSort_stack(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        // 栈容器用于存储子序列的开始索引和结束索引
        Stack<Integer> stack = new Stack<>();
        // 开始索引先进栈，结束索引后进栈
        stack.push(0);
        stack.push(arr.length - 1);

        while (!stack.empty()) {
            int right = stack.pop();
            int left = stack.pop();
            // 如果数组没有元素或者只有一个元素，直接下一次循环
            if (left >= right) {
                continue;
            }
            int pivotIndex = partition(arr, left, right);
            if (left < pivotIndex - 1) {
                stack.push(left);
                stack.push(pivotIndex - 1);
            }
            if (pivotIndex + 1 < right) {
                stack.push(pivotIndex + 1);
                stack.push(right);
            }
        }

    }

    // 将数组分成两部分,返回值是基准点的索引
    public static int partition(int[] arr, int left, int right) {
        // 将最后一个数作为基准点
        int pivot = arr[right];

        int pre = left;
        // 最后的基准点无需遍历
        for (int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                swap(arr, pre++, i);// 如果小于基准点就放到数组前面
            }
        }
        swap(arr, pre, right);// 将基准点放到中间位置
        return pre;
    }

    // 交换函数
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Test
    public void testQuickSort_stack() {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSortStack.quickSort_stack(arr);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testPartition() {
        int[] arr = {5, 4, 3, 2, 1};
        int pivotIndex = QuickSortStack.partition(arr, 0, arr.length - 1);
        assertEquals(2, pivotIndex);
    }

    @Test
    public void testSwap() {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSortStack.swap(arr, 0, arr.length - 1);
        int[] expected = {1, 4, 3, 2, 5};
        assertArrayEquals(expected, arr);
    }

}
