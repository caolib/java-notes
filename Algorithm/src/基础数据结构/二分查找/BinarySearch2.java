package 基础数据结构.二分查找;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 1; i <= 5; i++) {
            System.out.println(binarySearch2(arr, i));
        }
        System.out.println(binarySearch2(new int[]{}, 10));
        System.out.println(binarySearch2(null, 6));

    }

    public static int binarySearch2(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int i = 0;
        int j = arr.length;

        while (i < j) {
            int med = (i + j) >>> 1;
            if (target < arr[med]) {
                j = med;
            } else if (arr[med] < target) {
                i = med + 1;
            } else {
                return med;
            }
        }
        return -1;
    }
}
