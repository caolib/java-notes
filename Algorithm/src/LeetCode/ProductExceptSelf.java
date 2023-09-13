package Algorithm.src.LeetCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            int x = 1;
            for (int j = 0; j < len; j++) {
                if (j != i) {
                    x *= nums[j];
                }
            }
            answer[i] = x;
        }
        return answer;
    }

    public int[] productExceptSelfII(int[] nums) {
        int len = nums.length;
        List<Integer> zero = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                zero.add(i);
            }
        }

        if (zero.size() > 1) {
            return new int[len];
        } else if (zero.size() == 1) {
            int x = 1;
            int[] answer = new int[len];
            int index = zero.get(0);
            for (int i = 0; i < len; i++) {
                if (i != index) {
                    x *= nums[i];
                }
            }
            answer[index] = x;
            return answer;
        } else {
            int[] answer = new int[len];
            int x = 1;
            for (int num : nums) {
                x *= num;
            }
            for (int i = 0; i < len; i++) {
                answer[i] = x / nums[i];
            }
            return answer;
        }

    }

    public int[] productExceptSelfIII(int[] nums) {
        int len = nums.length;
        List<Integer> zero = new ArrayList<>();
        for (int i = 0; i < len; i++) if (nums[i] == 0) zero.add(i);
        if (zero.size() > 1) return new int[len];
        int x = 1;
        int[] answer = new int[len];
        if (zero.size() == 1) {
            int index = zero.get(0);
            for (int i = 0; i < len; i++) if (i != index) x *= nums[i];
            answer[index] = x;
            return answer;
        } else {
            for (int num : nums) x *= num;
            for (int i = 0; i < len; i++) answer[i] = x / nums[i];
            return answer;
        }
    }

    @Test
    public void test() {
        System.out.println(Arrays.toString(productExceptSelfPro(new int[]{1, 2, 3, 4})));
    }

    public int[] productExceptSelfPro(int[] nums) {
        int len = nums.length;

        List<Integer> zero = new ArrayList<>();
        for (int i = 0; i < len; i++) if (nums[i] == 0) zero.add(i);
        if (zero.size() > 1) return new int[len];
        if (zero.size() == 1) {
            int x = 1;
            int[] answer = new int[len];
            int index = zero.get(0);
            for (int i = 0; i < len; i++) if (i != index) x *= nums[i];
            answer[index] = x;
            return answer;
        }
        //没有0
        int[] left = new int[len];
        left[0] = 1;
        int[] right = new int[len];
        right[len - 1] = 1;
        //左边累积
        for (int i = 1; i < len; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        //右边累积
        for (int i = len - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = left[i] * right[i];
        }
        return nums;
    }


}
