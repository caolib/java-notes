package javaSE.src.案例.普通案例;

public class 冒泡排序 {
    public static void main(String[] args) {
        //给一个无序数组，进行冒泡排序后输出,默认从小到大
        int[] arr = {1, 123, -123, 17, 99, 666};
        System.out.println("排序前：");
        printArray(arr);

        bubblingSorting(arr);

        System.out.println("排序后：");
        printArray(arr);


    }

    public static void bubblingSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //打印数组
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");

    }

}
