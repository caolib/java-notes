package Collection集合.常用方法;

import java.util.ArrayList;
import java.util.Collection;

/*
    Collection集合常用方法：
    boolean add(Ee):添加元素
    boolean remove(Object o):从集合中移除指定的元素
    void clear():清空集合中的元素
    booLean contains(Object o):判断集合中是否存在指定的元素
    boolean isEmpty():判断集合是否为空
    int size():集合的长度，也就是集合中元素的个数
 */
public class Demo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        //1、添加元素 add 返回值为boolean类型
        System.out.println(c.add("hello"));
        System.out.println(c.add("world"));
        System.out.println(c);
        System.out.println("-------------");

        //2、移除元素 remove 返回值为boolean类型
        System.out.println(c.remove("hello"));
        System.out.println(c.remove("cxk"));
        System.out.println(c);
        System.out.println("-------------");

        //3、清空元素 clear
        c.add("a");
        c.add("a");
        c.add("a");
        c.clear();
        System.out.println(c);
        System.out.println("-------------");

        //4、是否包含元素判断 contains
        c.add("cxk");
        System.out.println(c);
        System.out.println(c.contains("cxk"));
        System.out.println(c.contains("ikun"));
        System.out.println("-------------");

        //5、判断集合是否为空 isEmpty
        System.out.println(c.isEmpty());
        c.clear();
        System.out.println(c.isEmpty());
        System.out.println("-------------");

        //6、集合的长度 size()
        c.add("ikun");
        c.add("ikun");
        c.add("ikun");
        System.out.println(c);
        System.out.println(c.size());

    }
}
