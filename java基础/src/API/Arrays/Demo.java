package java基础.src.API.Arrays;

import java.util.Arrays;

/*
    Arrays包含用于操作数组的各种方法
    1、Arrays.toString(int[] arr) 返回指定数组的字符串表达形式
    2、Arrays.sort(int[] arr)     按照数字顺序排列指定的数组

    Arrays属于工具类，设计思想：（类似的还有：System，Math等）
    1、构造方法用private修饰
    2、成员方法用public static修饰，可以通过类名直接访问成员方法

 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 12, 42, 666, -1, 0};
        System.out.println(Arrays.toString(arr));

        System.out.println("排序前：" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));

    }
}
