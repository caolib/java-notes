package Algorithm.src.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Duplicate {
    /*给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false*/
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.compute(num, (k, v) -> v + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                return true;
            }
        }

        return false;
    }
}
