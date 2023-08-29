package Algorithm.src.LeetCode;

import org.junit.jupiter.api.Test;

public class HIndex {

    @Test
    public void test() {
        System.out.println(hIndex(new int[]{3, 0, 6, 1, 5}));
        System.out.println(hIndex(new int[]{1, 3, 1}));
    }

    public int hIndex(int[] citations) {
        int len = citations.length;
        int[] arr = new int[len + 1];
        for (int citation : citations) {
            if (citation > len) {
                arr[len]++;
            } else {
                arr[citation]++;
            }
        }

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 1) {
                for (int j = 0; j < arr[i]; j++) {
                    citations[index] = i;
                    index++;
                }
            }
        }

        int h = 0;

        for (int i = len - 1; i >= 0; i--) {
            if (citations[i] <= h) {
                break;
            }
            h++;
        }

        return h;
    }
}
