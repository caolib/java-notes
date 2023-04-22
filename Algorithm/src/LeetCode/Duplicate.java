package Algorithm.src.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    /*给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false*/
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5}));
        System.out.println(containsDuplicate(new int[]{1, 2, 2, 3, 4, 5}));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            s.add(i);
        }
        return nums.length != s.size();
    }

    //对数组排序后判断相邻数据是否相同
    public static boolean containsDuplicateII(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
