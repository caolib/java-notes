package javaSE.src.案例.普通案例;

import java.util.Arrays;

public class Hello {
    /*
     * public static int f() {
     * System.out.println(666);
     * int a = 0;
     * try {
     * System.out.println("before");
     * a /= 0;
     * System.out.println("after");
     * } catch (Exception e) {
     * System.out.println("catch");
     * return a;
     * } finally {
     * System.out.println("finally");
     * a++;
     * return a;
     * }
     * }
     */

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }

    // 参数是数组、开始索引，结束索引
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIndex = parttition(arr, left, right);
        quickSort(arr, left, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, right);
    }

    // 找到一个基准点将比基准点小的元素放到前面，大的元素放到后面
    public static int parttition(int[] arr, int left, int right) {
        int pivot = arr[right];// 最后一个元素作为基准点

        // 如果比基准点小就将它和前面的数交换位置
        for (int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
                System.out.println("交换");
            }
        }
        // 只需要将第一个比基准点大的元素和基准点交换位置就分成了两个数组
        // 注意此时的pre索引就是第一个大元素数组的索引，因为每次交换后都+1了
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        System.out.println("交换");

        System.out.println(Arrays.toString(arr));
        // 返回值是基准点的索引
        return left;
    }
}

