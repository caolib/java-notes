package java面向对象.数组;

public class 数组的静态初始化 {
    public static void main(String[] args) {
        //初始化值，由值决定数组的长度
//        int[] arr = new int[]{1, 2, 3, 4, 5};
        //简化写法
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("地址为：" + arr);
        System.out.println("数组的长度为：" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
