package Algorithm.src.排序算法;


/**
 * <h1 color="#10ac84">插入排序</h1>
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, -1, 6, -5, 10};
        insertSort(arr);
    }

    public static int[] insertSort(int[] arr) {
        if (arr.length <= 1)
            return arr;

        for (int i = 1; i < arr.length; i++) {
            int insertIndex = i - 1;
            int insertVal = arr[i];

            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            //退出循环说明插入位置找到,insertIndex+1
            arr[insertIndex + 1] = insertVal;

/*            System.out.println("第" + i + "插入:");
            System.out.println(Arrays.toString(arr));*/

        }
        return arr;
    }

}
