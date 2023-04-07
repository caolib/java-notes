package Algorithm.src.LeetCode;

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
}
