package javaSE.src.案例.普通案例;

import org.junit.jupiter.api.Test;

public class TestDemo {

    @Test
    public void testMerge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {-1, 2, 7};
        merge(nums1, 3, nums2, 3);

        for (int i : nums1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * <h1 color="#10ac84">合并两个非递减的有序数组</h1>
     * <ul>
     *     <li color="#10ac84">从后往前遍历两个数组，比较大小然后根据索引插入数组1</li>
     * </ul>
     */


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;//插入位置的索引
        //两数组的最后一个元素的索引
        m--;
        n--;
        while (n >= 0) {
            //m>0:数组1已经全部插入完毕，只需要将数组2插入就行了
            if (m < 0 || nums1[m] < nums2[n]) {
                nums1[last] = nums2[n];
                last--;
                n--;
            } else {
                nums1[last] = nums1[m];
                last--;
                m--;
            }
        }
    }


    /**
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     */


    @Test
    public void testRemoveElement() {
        int[] arr = {1, 2, 2, 2, 2, 4, 2, 5, 2, 6, 2};
        int n = removeElement(arr, 2);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[left] = nums[i];
                left++;
            }
        }
        return left;
    }

    /**
     * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。如果 needle 不是 haystack 的一部分，则返回  -1 。
     */

    @Test
    public void testStr() {
        System.out.println(strStr("adbutsad", "sad"));
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }

}

