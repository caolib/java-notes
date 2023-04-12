package Algorithm.src.LeetCode;

public class MissingNumber {
    public static void main(String[] args) {
        /*给定一个包含 [0, n] 中 n 个数的数组 nums ，
        找出 [0, n] 这个范围内没有出现在数组中的那个数。

        做法：根据数组的长度确定数组应该为[0,arr.length],遍历数组查找遗失的的数字
        */
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missing(arr));

    }

    public static int missing(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            if (!isInArr(arr, i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isInArr(int[] arr, int i) {
        for (int k : arr) {
            if (k == i) {
                return true;
            }
        }
        return false;
    }
}
