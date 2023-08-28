package Algorithm.src.LeetCode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Merge {
    /**
     * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
     * 输出：[[1,6],[8,10],[15,18]]
     */
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        return intervals;
    }

    @Test
    public void test() {
        int[][] nums = {{2, 4}, {1, 5}};
        System.out.println(Arrays.deepToString(merge(nums)));
    }

}
