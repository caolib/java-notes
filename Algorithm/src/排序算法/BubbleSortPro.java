package Algorithm.src.排序算法;

/**
 * <h1 color="#10ac84">冒泡排序基础版和优化版</h1>
 * 主人，这是一个排序算法类，包含了基础版和优化版的冒泡排序方法
 */
public class BubbleSortPro {

    /**
     * <h2 color="#2c3e50">冒泡排序基础版</h2>
     * <p>
     *     主人，这是一个冒泡排序的基础版方法，用于对传入的整型数组进行排序
     * </p>
     * @param arr 待排序的整型数组
     */
    public static void bubbleSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * <h2 color="#2c3e50">冒泡排序优化版</h2>
     * <p>
     *     主人，这是一个冒泡排序的优化版方法，用于对传入的整型数组进行排序
     * </p>
     * <p>
     *     在基础版的基础上，增加了一个判断，如果在一轮中未进行交换，说明已经是有序的了，可以直接退出循环
     * </p>
     * @param arr 待排序的整型数组
     */
    public static void bubbleSortPro(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        //判断在一轮中是否进行了交换，如果未进行交换，说明已经是有序的了
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

}

