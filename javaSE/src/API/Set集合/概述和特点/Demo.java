package javaSE.src.API.Set集合.概述和特点;

import java.util.HashSet;
import java.util.Set;

/*
    Set：
        1、不含重复元素
        2、没有带索引的方法，所以无法使用普通的for循环遍历

    HashSet：对集合的迭代顺序不做任何保证
 */
public class Demo {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> s = new HashSet<String>();
        s.add("hello");
        s.add("world");
        s.add("java");
//        s.add("java");//不包含重复元素，添加不进去

        for (String i : s) {
            System.out.println(i);
        }

    }
}
