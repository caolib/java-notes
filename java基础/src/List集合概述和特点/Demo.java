package List集合概述和特点;

import java.util.ArrayList;
import java.util.List;

/*
    List集合特点
    有序：存储和取出的元素顺序一致
    可重复：存储的元素可以重复
 */
public class Demo {
    public static void main(String[] args) {
        //创建集合对象-List是抽象类，需要使用多态的方法创建对象
        List<String> l = new ArrayList<String>();

        //添加元素
        l.add("hello");
        l.add("hello");
        l.add("world");
        l.add("java");
        System.out.println(l);

        //迭代器方式遍历
//        Iterator<String> it = l.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        //增强for循环遍历
        for (String s : l) {
            System.out.println(s);
        }

        //其他方法
        //1 add添加元素
        //2 remove删除元素
        //3 set修改元素
        //4 get获取元素
        //集体描述同ArrayList(因为ArrayList继承了List)


    }
}
