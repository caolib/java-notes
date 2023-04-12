package Algorithm.src.LeetCode;

public class Majority {
    public static void main(String[] args) {
        /*
         * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
         * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
         */

        int[] arr = {1, 2, 3, 3, 3, 3, 3, 5};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            if (count(nums, nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    public static int count(int[] arr, int value) {
        int counts = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                counts++;
            }
        }
        return counts;
    }

}
