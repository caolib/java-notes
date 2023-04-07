package java基础.src.java面向对象.方法;

public class 方法练习2 {
    public static void main(String[] args) {
        //定义一个方法，格式化输出数组
        int[] arr = {11, 22, 33, 44, 55};
        printArr(arr);

    }

    public static void printArr(int[] arr) {
        System.out.print('[');
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print(']');
        System.out.println();
    }
}
