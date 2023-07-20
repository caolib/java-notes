package Algorithm.src.基础数据结构.二分查找;

import org.junit.jupiter.api.Test;

/**
 * 二分查找，如果找到就返回索引，没找到返回-1，数组必须是有序的
 * <p>
 * 问题1：为什么是 i<=j 而不是 i<j，因为i=j时，i和j同时指向的元素也可能是目标值
 * <p>
 * 问题2：(i+j)/2有没有问题？i+j可能超出int类型的最大范围，导致得出数据为负数，可以使用右移运算符（>>>）代替
 * >>>1 表示这个数字的二进制数全部向右移动一位（相当于/2），缺少的用0填充
 */

public class BinarySearch基础版 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(arr, 4));
        System.out.println(binarySearch(arr, 6));

    }

    public static int binarySearch(int[] arr, int target) {
        //如果数组为空或者数组长度小于等于1，直接返回-1
        if (arr == null || arr.length == 0) {
            return -1;
        }

        //先定义两个指针指向数组的两端
        int i = 0;
        int j = arr.length - 1;
        //循环条件是 i和j之间有数据，只要有数据就一直查找下去，直到没有数据或者找到了目标值
        while (i <= j) {
            //定义要查找区间的中间值(向下取整)
            int med = (i + j) / 2;        //右移运算符>>>相当于/2，但是不会出现超出int类型最大数据的可能
            if (arr[med] < target) {
                i = med + 1;                //如果大于中间值，那么查找的范围缩小到右边
            } else if (target < arr[med]) {
                j = med - 1;
            } else {
                return med;
            }
        }
        return -1;
    }


    //简单测试算法的可行性
    @Test
    public void testBinarySearch() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (binarySearch(arr, arr[i]) == i) {
                System.out.println("符合");
            } else {
                System.out.println("不符合");
            }
        }

    }


}
