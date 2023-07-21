package javaSE.src.java面向对象.方法;

public class 方法练习 {
    //求数组中最大的数
    public static void main(String[] args) {
        int[] arr = {1, 213412, 34534, 66666666, 341, 12421, 0};
        System.out.println("最大数：" + getMax(arr));

    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
