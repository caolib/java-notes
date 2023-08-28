package Algorithm.src.LeetCode;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Major {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int val = map.getOrDefault(num, 0) + 1;
            if (val > nums.length / 2)
                return num;
            map.put(num, val);
        }
        throw new RuntimeException("不存在多数");
    }

    @Test
    public void test() {
        int[] nums = {1, 1, 1, 2};

        System.out.println(majorityElementII(nums));

    }

    public int majorityElementII(int[] nums) {
        int major = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == major) {
                count++;
            } else {
                count--;
                if (count == -1) {
                    major = nums[i];
                    count = 1;
                }
            }
        }

        return major;
    }
}
