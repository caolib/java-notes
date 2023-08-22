package javaSE.src.案例.普通案例;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0};
        System.out.println(trimMean(arr));
    }

    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len = (int) (arr.length * 0.05);
        int sum = 0;
        for (int i = len; i < arr.length - len; i++) {
            sum += arr[i];
        }
        return Math.round(100000.0 * sum / (arr.length - 2 * len)) / 100000.0;
    }

    @Test
    public void test01() {
        System.out.println(0.01 + 0.09);
    }

}
