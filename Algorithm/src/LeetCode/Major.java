package Algorithm.src.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Major {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int major = -1;

        for (int num : nums) {
            int val = map.getOrDefault(num, 0) + 1;
            if (val > nums.length / 2) {
                major = num;
                break;
            }
            map.put(num, val);
        }


        return major;
    }

    public int majorityElementII(int[] nums) {


        return 0;
    }
}
