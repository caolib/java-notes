package javaSE.src.操作系统算法.页面置换算法;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        int num = 10000;
        int f = 0;
        int l = 0;

        int fifo = 0;
        int lru = 0;
        long fifo_hits = 0;
        long lru_hits = 0;

        long start = System.currentTimeMillis();

        for (int i = 0; i < 50; i++) {
            int[] arr = new int[num];
            for (int j = 0; j < num; j++) {
                arr[j] = r.nextInt(7);
            }

            f = FIFO.runFIFO(arr, 3);
            l = LRU.runLRU(arr, 3);
            fifo_hits += f;
            lru_hits += l;
            int x = f - l;
            if (x > 0) {
                fifo++;
            } else if (x < 0) {
                lru++;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("fifo = " + fifo);
        System.out.println("平均命中率：" + fifo_hits * 1.0 / 5000 + "%");
        System.out.println("lru = " + lru);
        System.out.println("平均命中率：" + lru_hits * 1.0 / 5000 + "%");

        System.out.println("总耗时" + (end - start) + "ms");
    }
}
