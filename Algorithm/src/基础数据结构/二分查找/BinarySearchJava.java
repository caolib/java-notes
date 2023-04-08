package Algorithm.src.基础数据结构.二分查找;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;

public class BinarySearchJava {
    /**
     * <h2 color="#10ac84">Java中内置的二分查找算法</h2>
     * <ul color="rgb(16,172,132)">
     *     <li><strong>没有找到时的返回值为: -(插入点+1)</strong></li>
     *     <li><strong>10应该插入到索引为2的位置，所以返回值为-3</strong></li>
     *     <li><strong>因为查找的元素索引可能为0，所以返回值必须-1来区分0和-0</strong></li>
     * </ul>
     */

    @Test
    @DisplayName("二分查找Java版")
    public void BinarySearch_Java() {
        /*
            根据返回值，如果没有找到目标值，
             就将目标值插入到合适位置，使数组仍然是有序的
        */
        int[] arr = {1, 3, 7, 66};
        int target = 6;

        //返回值 = -（插入点+1）
        int index = Arrays.binarySearch(arr, target);
        int insert = -index - 1;//得到插入点2

        //创建新数组插入目标值
        int[] targetArr = new int[arr.length + 1];
        for (int i = 0, j = 0; j < targetArr.length; i++, j++) {
            if (j == insert) {
                targetArr[j] = target;
                j++;
            }
            targetArr[j] = arr[i];
        }

        for (int i : targetArr) {
            System.out.print(i + " ");
        }


    }
}
