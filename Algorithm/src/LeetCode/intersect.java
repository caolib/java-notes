package Algorithm.src.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class intersect {
    public static void main(String[] args) {
        /*给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
         * 获取两个数组的hashmap，比较key
         * */
        int[] n1 = {4, 9, 5};
        int[] n2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(runIntersect(n1, n2)));

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        System.out.println(map);
        map.remove(1);
        System.out.println(map);

    }

    public static int[] runIntersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hs1 = getHahsMap(nums1);
        HashMap<Integer, Integer> hs2 = getHahsMap(nums2);
        hs1.entrySet().removeIf(e2 -> !hs2.containsKey(e2.getKey()));

        for (Map.Entry<Integer, Integer> e : hs1.entrySet()) {
            int key = e.getKey();
            //hs2中如果没有这个值就删除掉hs1中的这对映射
            if (hs2.containsKey(key)) {
                if (hs2.get(key) < hs1.get(key)) {
                    hs1.put(key, hs2.get(key));
                }
            }
/*            if (hs2.containsKey(key)) {
                if (hs1.get(key) > hs2.get(key)) {
                    hs1.put(key, hs2.get(key));
                }
            } else {
                hs1.remove(key);//使用foreach遍历时只能读取，不能修改，此处修改会触发异常!!!
            }*/
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : hs1.entrySet()) {
            for (int i = 0; i < e.getValue(); i++) {
                arr.add(e.getKey());
            }
        }

        int[] target = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            target[i] = arr.get(i);
        }
        return target;
    }

    public static HashMap<Integer, Integer> getHahsMap(int[] arr) {
        HashMap<Integer, Integer> hs = new HashMap();
        for (int j : arr) {
            if (hs.containsKey(j)) {
                hs.compute(j, (k, v) -> v + 1);
            } else {
                hs.put(j, 1);
            }
        }
        return hs;
    }
}
