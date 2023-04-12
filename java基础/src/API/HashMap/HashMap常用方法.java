package java基础.src.API.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap常用方法 {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        //添加方法 put(key,value)
        for (int i = 0; i < 10; i++) {
            hashMap.put(((char) ('a' + i)), i);
        }

        //遍历方法:迭代器遍历，entrySet()将HashMap转化成Set对象，这样才能使用迭代器
        //迭代器遍历可以直接修改或者删除（remove）HashMap中的映射，因为是线程安全的
        System.out.println("迭代器遍历:");
        Iterator<Map.Entry<Character, Integer>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            //这里的map对象就是hashmap中的每个对象
            Map.Entry<Character, Integer> map = it.next();
            System.out.print(map.toString() + " ");
        }
        System.out.println("\n\n-----------------------------");

        //增强for循环遍历,只能读取或修改value值，不能删除数据或修改key值，
        //否则会出现 ConcurrentModificationException 异常
        System.out.println("for_each遍历:");
        for (Map.Entry<Character, Integer> e : hashMap.entrySet()) {
            System.out.print(e.toString() + " ");
        }

        //removeIf(lambda表达式)安全删除方法,remove(key)也可以删除，但是不能用于增强for循环
        System.out.println("\n\n-----------------------");
        hashMap.entrySet().removeIf(map -> map.getKey() > 'd');
        System.out.println(hashMap);

        //修改方法，可以直接用put()覆盖
    }
}
