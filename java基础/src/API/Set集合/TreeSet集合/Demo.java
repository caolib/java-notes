package API.Set集合.TreeSet集合;

import java.util.TreeSet;

/*
    TreeSet集合特点
    1:元素有序，这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序，具体排序方式取决于构造方法
    TreeSet():根据其元素的自然排序进行排序
    TreeSet(Comparator comparator),:根据指定的比较器进行排序
    2:没有带索引的方法，所以不能使用普通fo循环遍历
    3:由于是set集合，所以不包含重复元素的集合
 */
public class Demo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(10);
        ts.add(30);
        ts.add(50);
        ts.add(20);
        ts.add(40);
        ts.add(40);

        for (int i : ts) {
            System.out.println(i);
        }

    }
}
