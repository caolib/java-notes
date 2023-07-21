package javaSE.src.API.List集合概述和特点.ArrayList;

import java.util.ArrayList;

public class ArrayList常用操作 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("java");
        arr.add("world");

        System.out.println("arr = " + arr);

        //1、remove(元素) 删除指定元素，返回是否删除成功的boolean值
        System.out.println("arr.remove(\"hello\") = " + arr.remove("hello"));
        System.out.println("arr.remove(\"c++\") = " + arr.remove("c++"));

        System.out.println("---------------------");
        System.out.println("arr = " + arr);
        //2、remove(索引) 删除指定索引处的元素，返回被删除的元素
        System.out.println("arr.remove(0) = " + arr.remove(0));

        System.out.println("---------------------");
        System.out.println("arr = " + arr);
        //3、set(索引，元素) 修改指定索引处的元素，返回被修改的元素
        System.out.println("arr.set(0, \"rock\") = " + arr.set(0, "rock"));

        System.out.println("---------------------");
        System.out.println("arr = " + arr);
        //4、get(索引) 返回指定索引处的元素
        System.out.println("arr.get(0) = " + arr.get(0));

        //5、size() 返回数组中元素的个数
        System.out.println("arr.size() = " + arr.size());

    }
}
