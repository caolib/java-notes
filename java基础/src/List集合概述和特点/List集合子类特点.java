package java基础.src.List集合概述和特点;

import java.util.ArrayList;
import java.util.LinkedList;

/*
    List集合常用子类：ArrayList,LinkedList
    ArrayList:底层数据结构是数组，查询快，增册慢
    LinkedList:底层数据结构是链表，查询慢，增删快
    练习：
    分别使用ArrayList和LinkedList?完成存储字符串并遍历
 */
public class List集合子类特点 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("java");

        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("----------");

        //LinkedList底层数据结构是链表
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("hello");
        linkedlist.add("world");
        linkedlist.add("java");
        for (String s : linkedlist) {
            System.out.println(s);
        }


    }
}
