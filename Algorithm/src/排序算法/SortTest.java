package Algorithm.src.排序算法;

import java.util.Arrays;
import java.util.Random;

import static Algorithm.src.排序算法.BubbleSortPro.bubbleSort;
import static Algorithm.src.排序算法.BubbleSortPro.bubbleSortPro;
import static Algorithm.src.排序算法.CountSort.countSort;
import static Algorithm.src.排序算法.InsertSort.insertSort;
import static Algorithm.src.排序算法.QuickSort.quickSort;
import static Algorithm.src.排序算法.SelectionSort.selectSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SortTest {

    /**
     * <h1 color="#10ac84">空白实验</h1>
     */
    public static int[] test(int[] arr) {
        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("内置sort\t" + (end - start) + "ms");
        return arr;
    }


    /**
     * <h1 color="#10ac84">选择排序</h1>
     */
    public static int[] testSelectSort(int[] arr) {
        long start = System.currentTimeMillis();
        selectSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("选择\t\t" + (end - start) + "ms");
        return arr;
    }

    /**
     * <h1 color="#10ac84">冒泡排序Pro</h1>
     */
    public static int[] testBubbleSort(int[] arr) {
        long start = System.currentTimeMillis();
        bubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("冒泡\t\t" + (end - start) + "ms");
        return arr;
    }

    /**
     * <h1 color="#10ac84">冒泡排序Pro</h1>
     */
    public static int[] testBubbleSortPro(int[] arr) {
        long start = System.currentTimeMillis();
        bubbleSortPro(arr);
        long end = System.currentTimeMillis();
        System.out.println("冒泡Pro\t" + (end - start) + "ms");
        return arr;
    }


    /**
     * <h1 color="#10ac84">插入排序</h1>
     */
    public static int[] testInsertSort(int[] arr) {
        long start = System.currentTimeMillis();
        insertSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("插入\t\t" + (end - start) + "ms");
        return arr;
    }


    /**
     * <h1 color="#10ac84">快速排序</h1>
     */
    public static int[] testQuickSort(int[] arr) {
        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        System.out.println("快速\t\t" + (end - start) + "ms");
        return arr;
    }

    /**
     * <h1 color="#10ac84">计数排序</h1>
     */
    public static int[] testCountSort(int[] arr) {
        long start = System.currentTimeMillis();
        countSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("计数\t\t" + (end - start) + "ms");
        return arr;
    }


    /**
     * <h1 color="#10ac84">测试选择排序、冒泡、插入、快速排序</h1>
     */
    public static void main(String[] args) {
        System.out.println("结果无法比较算法的优劣");
        System.out.println("排序算法\t" + "用时" + "\t");
        int[] arr = getArr();

        int[] test = test(arr);
        int[] select = testSelectSort(arr);
        int[] bubble = testBubbleSort(arr);
        int[] bubblePro = testBubbleSortPro(arr);
        int[] insert = testInsertSort(arr);
//        int[] quick = testQuickSort(arr);
        int[] count = testCountSort(arr);

        assertArrayEquals(test, select);
        assertArrayEquals(test, bubble);
        assertArrayEquals(test, bubblePro);
        assertArrayEquals(test, insert);
//        assertArrayEquals(test, quick);
        assertArrayEquals(test,count);

    }

    /**
     * <h1 color="#10ac84">待排序数组</h1>
     */
    private static final int num = 100000;
    public static int[] arr = getArr();


    /**
     * <h1 color="#10ac84">返回长度为num的数组，每个元素都是[0,10000000)之间的随机数字</h1>
     */
    public static int[] getArr() {
        int[] arr = new int[num];
        Random rd = new Random();
        for (int i = 0; i < num; i++) {
            arr[i] = rd.nextInt(10000000);
        }

        return arr;
    }

}
