package javaSE.src.API.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Collections工具类
 */

public class CollectionsDemo {
    public static void main(String[] args) {
        //1.批量添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "123", "abc", "ikun");
        System.out.println(list);

        //2.shuffle打乱元素
        ArrayList<String> list2 = new ArrayList<>(list);
        Collections.shuffle(list2);
        System.out.println(list2);

        //3.binarySearch二分查找
        System.out.println(Collections.binarySearch(list, "abc"));

        //4.max/min获取默认排序下的最大/最小值
        ArrayList<Integer> l = new ArrayList<>();
        Collections.addAll(l, 1, 2, 3, 4, 5, 666, 999);
        System.out.println(Collections.max(l));
        System.out.println(Collections.min(l));

        //5.swap交换指定索引处的元素
        Collections.swap(l, 0, l.size() - 1);
        System.out.println(l);

    }
}
