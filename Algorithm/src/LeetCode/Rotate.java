package Algorithm.src.LeetCode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Rotate {

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rotateII(nums, 6);
        System.out.println(Arrays.toString(nums));

    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;

        if (k <= len / 2) {
            //后移
            for (int i = 0; i < k; i++) {
                int temp = nums[len - 1];
                for (int j = len - 1; j > 0; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[0] = temp;
            }
        } else {
            k = len - k;
            //前移
            for (int i = 0; i < k; i++) {
                int temp = nums[0];
                for (int j = 0; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[len - 1] = temp;
            }
        }
        System.out.println("k = " + k);
    }

    public void rotateII(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        int[] arr = new int[len];
        System.arraycopy(nums, 0, arr, 0, len);
        if (k >= 0) System.arraycopy(arr, len - k, nums, 0, k);
        if (nums.length - k >= 0) System.arraycopy(arr, 0, nums, k, nums.length - k);
    }
}
