package java基础.src.案例.普通案例;

import org.junit.Test;

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
     * */


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
}