package Algorithm.src.排序算法;


/**
 * <h1 color="#10ac84">冒泡排序</h1>
 * */
public class BubbleSortPro {
    public static void bubbleSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        //判断在一轮中是否进行了交换，如果未进行交换，说明已经是有序的了
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
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
            }else{
                flag = false;
            }
        }
    }
}
