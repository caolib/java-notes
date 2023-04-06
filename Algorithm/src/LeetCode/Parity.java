package LeetCode;

import java.util.Arrays;

public class Parity {
    public static void main(String[] args) {
        /*给你一个整数数组 nums，将 nums 中的的所有偶数元素移动到数组的前面，后跟所有奇数元素。
        返回满足此条件的 任一数组 作为答案。*/
        int[] arr = {1, 3};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int[] arr = new int[nums.length];
        //定义两个指针分别指向数组中奇数区和偶数区的开始索引
        int left = 0;
        int right = num(nums);
        if (right == 0) {
            return nums;
        }

        for (int i : nums) {
            if (i % 2 == 0) {
                arr[left] = i;
                left++;
            } else {
                arr[right] = i;
                right++;
            }
        }
        return arr;
    }

    //返回数组中偶数的个数
    public static int num(int[] arr) {
        int num = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                num++;
            }
        }
        return num;
    }
}
