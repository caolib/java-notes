package javaSE.src.案例.普通案例;

public class 数组反转 {
    public static void main(String[] args) {
        //将数组反转并输出
        int[] arr = {1, 2, 3, 4, 5};
        printArr(arr);
        reverseArr(arr);
        printArr(arr);

        int[] arr2 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr2[i] = i + 10;
        }
        printArr(arr2);
        reverseArr(arr2);
        printArr(arr2);

    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void reverseArr(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

    }

}
