package Algorithm.src.基础数据结构.二分查找;

/**
 * 不在循环内找出target的索引，而是一直循环直到只剩下i索引后
 * <p>
 * 退出，然后比较a[i]与target的值
 * */

public class BinarySearch平衡版 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(BinarySearch3(arr, 5));
    }
    public static int BinarySearch3(int[] a, int target) {
        //左闭右开
        int i = 0;
        int j = a.length;
        //j-i大于1意思就是i和j之间没有数据
        while (j - i > 1) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m;
            } else {
                i = m;//不是m+1，因为，是>=，可能这个值就是target
            }
        }
        if (a[i] == target) {
            return i;
        }
        return -1;
    }
}
