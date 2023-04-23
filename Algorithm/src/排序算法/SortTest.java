package Algorithm.src.排序算法;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static Algorithm.src.排序算法.BubbleSortPro.bubbleSort;
import static Algorithm.src.排序算法.SelectionSort.selectSort;


public class SortTest {

    /**
     * <h1 color="#10ac84">空白实验</h1>
     */
    public static int[] test(int[] arr) {
        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("内置sort\t" + (end - start) + "\t");
        return arr;
    }


    /**
     * <h1 color="#10ac84">选择排序</h1>
     */
    public static int[] testSelectSort(int[] arr) {
        long start = System.currentTimeMillis();
        selectSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("选择排序\t" + (end - start) + "\t");
        return arr;
    }

    /**
     * <h1 color="#10ac84">冒泡排序</h1>
     */
    public static int[] testBubbleSort(int[] arr) {
        long start = System.currentTimeMillis();
        bubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序Pro\t" + (end - start) + " \t");
        return arr;
    }

    /**
     * <h1 color="#10ac84">测试选择排序和冒泡排序</h1>
     */
    @Test
    public void test01() {
        System.out.println("排序算法种类\t" + "用时/ms\t");

        int[] arr = getArr();

        int[] test = test(arr);
        int[] select = testSelectSort(arr);
        int[] bubble = testBubbleSort(arr);

        System.out.print("结果:");
        System.out.println(Arrays.equals(test, select));
        System.out.println(Arrays.equals(test, bubble));
    }

    /**
     * <h1 color="#10ac84">待排序数组</h1>
     */
    private static final int num = 100000;
    public static int[] arr = getArr();
    public static int[] worstArr = getWorstArr(num);


    /**
     * <h1 color="#10ac84">返回长度为num的数组，每个元素都是0-999的随机数字</h1>
     */
    public static int[] getArr() {
        Random random = new Random();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }

    /**
     * <h1 color="#10ac84">最坏情况</h1>
     */
    public static int[] getWorstArr(int num) {
        int[] arr = new int[num];
        for (int i = num - 1; i >= 0; i--) {
            arr[i] = i;
        }
        return arr;
    }
}
