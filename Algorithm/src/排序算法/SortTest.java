package Algorithm.src.排序算法;

import java.util.Arrays;

import static Algorithm.src.排序算法.BubbleSortPro.bubbleSort;
import static Algorithm.src.排序算法.BubbleSortPro.bubbleSortPro;
import static Algorithm.src.排序算法.SelectionSort.selectSort;


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
     * <h1 color="#10ac84">测试选择排序和冒泡排序</h1>
     */
    public static void main(String[] args) {
        System.out.println("排序算法\t" + "用时" + "\t");
        int[] arr = getArr();

        int[] test = test(arr);
        int[] select = testSelectSort(arr);
        int[] bubble = testBubbleSort(arr);
        int[] bubblePro = testBubbleSortPro(arr);


        if (!(Arrays.equals(test, select) && Arrays.equals(test, bubble) && Arrays.equals(test, bubblePro))) {
            System.out.println("错误！");
        }
    }

    /**
     * <h1 color="#10ac84">待排序数组</h1>
     */
    private static final int num = 80000;
    public static int[] arr = getArr();


    /**
     * <h1 color="#10ac84">返回长度为num的数组，每个元素都是[0,10000000)之间的随机数字</h1>
     */
    public static int[] getArr() {
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int) (Math.random() * 8000000);
        }
        return arr;
    }

}
