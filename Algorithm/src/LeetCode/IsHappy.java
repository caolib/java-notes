package Algorithm.src.LeetCode;

import org.junit.jupiter.api.Test;

public class IsHappy {
    @Test
    public void test() {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    //123
    public boolean isHappy(int n) {
        int sum = 0;
        int step = 0;
        while (sum != 1 && step <= 1000) {
            sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            if (sum == 1) {
                break;
            }
            n = sum;
            step++;

            String s = "https://www.baidu.com";

        }
        return step != 1001;
    }
}
