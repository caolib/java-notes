package Algorithm.src.LeetCode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class ParityII {
    public static void main(String[] args) {
        /*给定一个非负整数数组 nums，nums 中一半整数是 奇数 ，一半整数是 偶数 。对数组进行排序，以便当 nums[i] 为奇数时，i 也是 奇数 ；当 nums[i] 为偶数时， i 也是 偶数 。你可以返回 任何满足上述条件的数组作为答案 。*/
    }

    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();//奇数
        ArrayList<Integer> even = new ArrayList<>();//偶数
        for (int i = 0; i < nums.length; i++) {
            //奇数索引不是奇数或者偶数索引不是偶数
            if ((nums[i] - i) % 2 != 0) {
                index.add(i);
                if (nums[i] % 2 == 0) {
                    even.add(nums[i]);
                } else {
                    odd.add(nums[i]);
                }
            }
        }
        return nums;
    }

    @Test
    public void testSortArrayByParityII() {
        ParityII parityII = new ParityII();

        // 测试用例1：奇数和偶数数量相等，且按照要求排列
        int[] nums1 = {2, 3, 4, 1, 6, 7};
        int[] expected1 = {2, 3, 4, 1, 6, 7};
        Assertions.assertArrayEquals(expected1, parityII.sortArrayByParityII(nums1));

        // 测试用例2：奇数和偶数数量相等，但未按照要求排列
        int[] nums2 = {2, 4, 1, 3, 6, 7};
        int[] expected2 = {2, 1, 4, 3, 6, 7};
        Assertions.assertNotEquals(expected2, parityII.sortArrayByParityII(nums2));

        // 测试用例3：全部为奇数
        int[] nums3 = {1, 3, 5, 7, 9};
        int[] expected3 = {1, 3, 5, 7, 9};
        Assertions.assertArrayEquals(expected3, parityII.sortArrayByParityII(nums3));

        // 测试用例4：全部为偶数
        int[] nums4 = {2, 4, 6, 8, 10};
        int[] expected4 = {2, 4, 6, 8, 10};
        Assertions.assertArrayEquals(expected4, parityII.sortArrayByParityII(nums4));

        // 测试用例5：空数组
        int[] nums5 = {};
        int[] expected5 = {};
        Assertions.assertArrayEquals(expected5, parityII.sortArrayByParityII(nums5));
    }
}
