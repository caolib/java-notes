package javaSE.src.API.List集合概述和特点;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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


        //遍历方法

        /*

        //1.迭代器方式遍历
        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //2.增强for循环遍历
        for (String s : l) {
            System.out.println(s);
        }

        //3.普通for循环遍历
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        //4.lambda表达式遍历
        l.forEach(s -> System.out.println(s));

        */

        //5.列表迭代器遍历
        //5.1迭代器和列表迭代器遍历的时候都不能使用列表的方法增加或者删除元素，要使用迭代器添加或者删除，否则否发生并发修改异常
        //5.2迭代器中只能出现一次next()方法，否则可能出现元素不存在异常,因为next方法不仅会获取当前迭代器指向的元素还会将指针往后移动一位
        ListIterator<String> it = l.listIterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("hello")) {
                it.set("ok");
            } else if (s.equals("java")) {
                it.remove();
            }
            System.out.println(s);
        }

        System.out.println("l = " + l);

        //其他方法
        //1 add添加元素
        //2 remove删除元素
        //3 set修改元素
        //4 get获取元素
        //具体描述同ArrayList(因为ArrayList继承了List)


    }
}
