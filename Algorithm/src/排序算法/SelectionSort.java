package Algorithm.src.排序算法;

/**
 * <h1 color="#10ac84">选择排序</h1>
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, -10};
        selectSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void selectSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            //找出最小值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
