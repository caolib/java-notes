package java基础.src.案例.普通案例;

import org.junit.Assert;

import java.util.Arrays;
import java.util.Stack;


public class Paper {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};
        qs(arr);
        int[] expected = {1, 2, 4, 7, 9};
        Assert.assertArrayEquals(expected, arr);

        //添加一些测试用例
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        qs(arr1);
        int[] expected1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertArrayEquals(expected1, arr1);


        int[] arr2 = {1, 6, 7, 2, 5, 8, 3, 4, 9, 10};
        qs(arr2);
        int[] expected2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertArrayEquals(expected2, arr2);

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        qs(arr3);
        int[] expected3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Assert.assertArrayEquals(expected3, arr3);

        //生成有100,000,000个int数据的数组，数组中的数据全部在-1000000~1000000之间随机生成，使用qs函数排序，打印排序所用时间，以及判断排序后的数组是否有序
        int[] arr4 = new int[100_000_000];
        int[] test = new int[100_000_000];
        for (int i = 0; i < arr4.length; i++) {
            int val = (int) (Math.random() * (1_000_000 - (-1)) + (-1));
            arr4[i] = val;
            test[i] = val;
        }
        long start = System.currentTimeMillis();
        qs(arr4);
        long end = System.currentTimeMillis();
        System.out.println("qs耗时: " + (end - start) + "ms");
        start =  System.currentTimeMillis();
        Arrays.sort(test);
        end = System.currentTimeMillis();
        System.out.println("sort耗时: " + (end - start) + "ms");
        if (Arrays.equals(test, arr4)) {
            System.out.println("正确!");
        } else{
            System.out.println("错误");
        }
    }

    public static void qs(int[] arr) {
        if (arr.length <= 1)
            return;
        //创建一个栈容器存储需要进行排序的索引区间
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(arr.length - 1);

        while (!stack.empty()) {
            int right = stack.pop();
            int left = stack.pop();
            int pivotIndex = partition(arr, left, right);
            if (left < pivotIndex - 1) {
                stack.push(left);
                stack.push(pivotIndex - 1);
            }
            if (right > pivotIndex + 1) {
                stack.push(pivotIndex + 1);
                stack.push(right);
            }
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        for (int i = left; i <= right - 1; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        int temp = arr[left];
        arr[left] = pivot;
        arr[right] = temp;

        return left;
    }

}


