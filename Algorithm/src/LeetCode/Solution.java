package Algorithm.src.LeetCode;

/*
    给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 该保持 一致 。然后返回 nums 中唯一元素的个数。考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
    返回 k

    输入：nums = [0,0,1,1,1,2,2,3,3,4]
    输出：5, nums = [0,1,2,3,4]
    解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
*/

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Solution {
    @Test
    public void test() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

/*    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int n = 0;
        for (Integer i : set) {
            nums[n++] = i;
        }
        return set.size();
    }*/

    public int removeDuplicates(int[] nums) {
        int l = 0, r = 1;
        while (r < nums.length) {
            if (nums[l] != nums[r]) {
                l++;
                if (l != r) {
                    nums[l] = nums[r];
                }
            }
            r++;
        }

        return l + 1;
    }

    @Test
    public void testII() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicatesII(nums));
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicatesII(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int l = 2;

        for (int r = 2; r < nums.length; r++) {
            if (nums[r] != nums[l - 2]) {
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }


    @Test
    public void testPro() {
        int[] nums = {1, 1, 1, 1, 2, 2, 2, 2, 3};
        System.out.println(process(nums));
        System.out.println(Arrays.toString(nums));
    }


    int process(int[] nums) {
        int u = 0;
        for (int x : nums) {
            if (u < 2 || nums[u - 2] != x) {
                nums[u] = x;
                u++;
            }
        }
        return u;
    }


}
