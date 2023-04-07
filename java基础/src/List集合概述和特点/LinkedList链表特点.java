package java基础.src.List集合概述和特点;

import java.util.LinkedList;

/*
    LinkedList集合的特有功能：
    public void addFirst(Ee):在该列表开头插入指定的元素
    public void addLast(Ee):将指定的元素追加到此列表的末尾
    public E getFirst():返回此列表中的第一个元素
    public E getlast():返回此列表中的最后一个元素
    public E removeFirst():从此列表中删除并返回第一个元素
    public E removeLast():从此列表中册除并返回最后一个元素
 */
public class LinkedList链表特点 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);

        //1 public void addFirst(Ee):在该列表开头插入指定的元素
        System.out.println("----------");
        System.out.println(linkedlist);
        linkedlist.addFirst(0);
        System.out.println(linkedlist);

        //  public void addLast(Ee):将指定的元素追加到此列表的末尾
        System.out.println("----------");
        System.out.println(linkedlist);
        linkedlist.addLast(6);
        System.out.println(linkedlist);

        //2   public E getFirst():返回此列表中的第一个元素
        //    public E getlast():返回此列表中的最后一个元素
        System.out.println("----------");
        System.out.println(linkedlist);
        System.out.println(linkedlist.getFirst());
        System.out.println(linkedlist.getLast());

        //3   public E removeFirst():从此列表中删除并返回第一个元素
        //    public E removeLast():从此列表中册除并返回最后一个元素
        System.out.println("----------");
        System.out.println(linkedlist);
        linkedlist.removeFirst();
        System.out.println(linkedlist);
        linkedlist.removeLast();
        System.out.println(linkedlist);

    }
}
