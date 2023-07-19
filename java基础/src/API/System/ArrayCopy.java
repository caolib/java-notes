package java基础.src.API.System;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];

        //数组拷贝
        //参数
        //1.数据源，从哪个数组中进行拷贝
        //2.数据源开始拷贝的索引
        //3.目标数组
        //4.从目标数组哪个索引开始粘贴
        //5.拷贝的长度
        System.arraycopy(arr1, 3, arr2, 1, 3);

        for (int i : arr2) {
            System.out.print(i + " ");
        }

    }
}
