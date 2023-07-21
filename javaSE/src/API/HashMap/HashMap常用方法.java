package javaSE.src.API.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap常用方法 {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        System.out.println("--------------->>> 1 <<<---------------");
        //1.添加方法 put(key,value)
        //细节：添加或覆盖
        //1.1如果key不存在，直接添加并返回null
        //1.2如果key存在，那么会覆盖原来的键值对并返回原来的value
        //1.3修改方法，可以直接用put()覆盖
        for (int i = 0; i < 10; i++) {
            hashMap.put(((char) ('a' + i)), i);
        }

        System.out.println("--------------->>> 2 <<<---------------");
      /*  //2.遍历方法:迭代器遍历，entrySet()将HashMap转化成Set对象，这样才能使用迭代器
        //2.1迭代器遍历可以直接修改或者删除（remove）HashMap中的映射，因为是线程安全的
        System.out.println("迭代器遍历:");
        Iterator<Map.Entry<Character, Integer>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            //这里的map对象就是hashmap中的每个对象
            Map.Entry<Character, Integer> map = it.next();
            System.out.print(map.toString() + " ");
        }
        System.out.println();*/

        //2.2增强for循环遍历,只能读取或修改value值，不能删除数据或修改key值，
        //否则会出现 ConcurrentModificationException 异常
        System.out.println("for_each遍历:");
        for (Map.Entry<Character, Integer> e : hashMap.entrySet()) {
            System.out.print(e.toString() + " ");
        }
        System.out.println();

        System.out.println("--------------->>> 3 <<<---------------");
        //3.removeIf(lambda表达式)安全删除方法,remove(key)也可以删除，但是不能用于增强for循环
        hashMap.entrySet().removeIf(map -> map.getKey() > 'd');
        System.out.println(hashMap);


        System.out.println("--------------->>> 4 <<<---------------");
        //4.clear()清空集合,isEmpty()判断是否为空
        HashMap<Character, Integer> h = new HashMap<>(hashMap);
        h.clear();
        System.out.println(h);
        System.out.println(h.isEmpty());

        System.out.println("--------------->>> 5 <<<---------------");
        //5.containsKey/containsValue
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("张三", 10);
        hm.put("李四", 20);
        hm.put("王五", 30);
        hm.put("坤坤", 10);
        //5.1判断key是否存在
        System.out.println(hm.containsKey("坤坤"));
        System.out.println(hm.containsKey("ikun"));
        //5.2判断value是否存在
        System.out.println(hm.containsValue(10));

    }
}
