package javaSE.src.API.Collection集合.遍历;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    Iterator:迭代器，集合的专用遍历方式
    Iterator<E>iterator():返回此集合中元素的迭代器，通过集合的iterator()方法得到
    迭代器是通过集合的iterator()方法得到的，所以我们说它是依赖于集合而存在的
    Iterator中的常用方法:
    E next():返回迭代中的下一个元素
    boolean hasNext():如果迭代具有更多元素，则返回true
 */
public class Demo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");
        Iterator<String> it = c.iterator();

        //next 返回迭代器的下一个元素
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());//NoSuchElementException 表示请求的元素不存在

        //boolean hasNext():如果迭代具有更多元素，则返回true
//        if (it.hasNext()) {
//            System.out.println(it.next());
//        }

        //1.迭代器和列表迭代器遍历的时候都不能使用集合的方法增加或者删除元素，要使用迭代器添加或者删除，否则否发生并发修改异常
        //2.迭代器中只能出现一次next()方法，否则可能出现元素不存在异常,因为next方法不仅会获取当前迭代器指向的元素还会将指针往后移动一位

        //1.迭代器遍历Collection集合
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        //2.增强for循环遍历集合
        for (String s : c) {
            System.out.println(s);
        }

        //3.lambda表达式遍历集合
        c.forEach(s -> System.out.print(s + " "));


    }
}
