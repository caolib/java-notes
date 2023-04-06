package API.Set集合.LinkedHashSet集合;

import java.util.LinkedHashSet;

/*
    LinkedHashSet集合特点
    1:哈希表和链表实现的Set接口，具有可预测的迭代次序
    2:由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
    3:由哈希表保证元素唯一，也就是说没有重复的元素
 */
public class Demo {
    public static void main(String[] args) {
        LinkedHashSet<String> lsh = new LinkedHashSet<String>();

        lsh.add("hello");
        lsh.add("world");
        lsh.add("java");
        lsh.add("java");//哈希表保证元素的唯一


        //链表保证元素的有序
        for (String s : lsh) {
            System.out.println(s);
        }

    }
}
