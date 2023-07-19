package Algorithm.src.排序算法;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class QuickSortStackPro {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        quick_sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));


    }


    /**
     * 快速排序-栈
     * 返回排序过程中所有发生交换的情况
     */
    public static void quick_sort(int[] arr, int left, int right) {
        Stack<Integer> stack = new Stack<>();
        stack.push(left);
        stack.push(right);
        while (!stack.empty()) {
            //从栈中取出前后索引
            int r = stack.pop();
            int l = stack.pop();
            int midIndex = partition(arr, l, r);
            for (int i : arr)
                System.out.println(i);
            System.out.println();
            if (l < midIndex - 1) {
                stack.push(l);
                stack.push(midIndex - 1);
            }
            if (midIndex + 1 < r) {
                stack.push(midIndex + 1);
                stack.push(r);
            }
        }
    }

    //双边指针交换法
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int l = left, r = right;
        //左右指针还未相遇
        while (l < r) {
            //从右往左找一个<=基准点的数，没找到就继续左移
            while (arr[r] > pivot && l < r)
                r--;
            //从左往右找一个>基准点的数，没找到就继续右移
            while (arr[l] <= pivot && l < r)
                l++;
            if (l < r)
                swap(arr, l, r);
        }
        arr[left] = arr[l];
        arr[l] = pivot;


        return l;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Test
    public void testQuickSort() {
        int[] arr = {5, 2, 9, 1, 7};
        int[] expected = {1, 2, 5, 7, 9};
        quick_sort(arr, 0, arr.length - 1);
        Assert.assertArrayEquals(expected, arr);
    }
    @Test
    public void testPartition() {
        int[] arr = {5, 2, 9, 1, 7};
        int pivotIndex = partition(arr, 0, arr.length - 1);
        Assert.assertEquals(2, pivotIndex);
        Assert.assertEquals(1, arr[pivotIndex]);
    }
    @Test
    public void testSwap() {
        int[] arr = {5, 2, 9, 1, 7};
        swap(arr, 0, 4);
        int[] expected = {7, 2, 9, 1, 5};
        Assert.assertArrayEquals(expected, arr);
    }
    @Test
    public void testQuickSortWithEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        quick_sort(arr, 0, arr.length - 1);
        Assert.assertArrayEquals(expected, arr);
    }
    @Test
    public void testQuickSortWithSingleElement() {
        int[] arr = {5};
        int[] expected = {5};
        quick_sort(arr, 0, arr.length - 1);
        Assert.assertArrayEquals(expected, arr);
    }
    @Test
    public void testQuickSortWithDuplicateElements() {
        int[] arr = {5, 2, 9, 1, 7, 2, 5};
        int[] expected = {1, 2, 2, 5, 5, 7, 9};
        quick_sort(arr, 0, arr.length - 1);
        Assert.assertArrayEquals(expected, arr);
    }
    @Test
    public void testQuickSortWithDescendingOrder() {
        int[] arr = {9, 7, 5, 3, 1};
        int[] expected = {1, 3, 5, 7, 9};
        quick_sort(arr, 0, arr.length - 1);
        Assert.assertArrayEquals(expected, arr);
    }


}
