package Algorithm.src.LeetCode;

import org.junit.jupiter.api.Test;

public class CanCompleteCircuit {
    @Test
    public void test() {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        System.out.println(canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        for (int i = 0; i < len; i++) {
            int init = gas[i] - cost[i];
            if (init < 0)
                continue;
            int j = (i + 1) % len;
            int g = init;
            int c;
            do {
                g += gas[j];
                c = cost[j];
                if (g < c) {
                    break;
                }
                g -= c;
                j = (j + 1) % len;
            } while (i != j);

            if (i == j) {
                return i;
            }
        }
        return -1;
    }

    public int canCompleteCircuitII(int[] gas, int[] cost) {
        int len = gas.length;

        for (int i = 0; i < len; i++) {
            int g = 0;
            int c;
            int j;
            for (j = i; j < len; j++) {

            }


        }

        return -1;
    }
}
