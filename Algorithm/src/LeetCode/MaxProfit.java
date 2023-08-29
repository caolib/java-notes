package Algorithm.src.LeetCode;

import org.junit.jupiter.api.Test;

public class MaxProfit {
    @Test
    public void test() {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int[] nums2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfitII(nums));
        System.out.println(maxProfitII(nums2));
        System.out.println(maxProfitPro(nums));
        System.out.println(maxProfitPro(nums2));
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }

    public int maxProfitII(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;


        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public int maxProfitPro(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }

        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int pro = prices[i + 1] - prices[i];
            if (pro > 0) {
                profit += pro;
            }
        }
        return profit;
    }

}
