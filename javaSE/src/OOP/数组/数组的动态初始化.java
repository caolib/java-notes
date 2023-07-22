package javaSE.src.OOP.数组;

public class 数组的动态初始化 {
    public static void main(String[] args) {
        //动态初始化：初始化时只指定数组的长度，由系统分配初始值
        //语法：数据类型 [] 变量名 = new 数据类型 [数组长度];
        int[] arr = new int[3];     //系统分配的初始值为0
        int[] arr2 = arr;       //arr和arr2指向同一个地址，两个数组是相同的
        System.out.println(arr);
        System.out.println(arr2);


    }
}
