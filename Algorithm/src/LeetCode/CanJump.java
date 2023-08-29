package Algorithm.src.LeetCode;

import org.junit.jupiter.api.Test;

public class CanJump {
    @Test
    public void test() {
        int[] nums = {1, 2};
        int[] nums2 = {3, 2, 1, 0, 4};
        int[] nums3 = {0, 2, 3};

        System.out.println(canJump(nums));
        System.out.println(canJump(nums2));
        System.out.println(canJump(nums3));
        System.out.println(canJump(new int[]{1, 0, 1, 0}));
    }

    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        if (nums[0] == 0) return false;

        int len = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (i <= len) {
                if (i + nums[i] > len) {
                    len = i + nums[i];
                }
            } else
                return false;

            if (len >= nums.length - 1) {
                return true;
            }
        }
        return len >= nums.length - 1;
    }

    @Test
    public void testJump() {
        System.out.println(jump(new int[]{7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3}));
    }

    public int jump(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return 0;
        }

        int left = 0;
        int right = 0;

        int length = 0;
        int step = 0;

        while (length < len - 1) {
            for (int i = left; i <= right; i++) {
                int d = i + nums[i];
                if (d > length) {
                    length = d;
                }
            }
            step++;
            left = right + 1;
            right = length;
        }

        return step;
    }

}
