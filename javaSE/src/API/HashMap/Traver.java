package javaSE.src.API.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Traver {
    /**
     * map的三种遍历方式
     */
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 10);
        map.put("ikun", 20);
        map.put("kunkun", 30);

        System.out.println("--------------->>> 1.键找值 <<<---------------");
        //1.获取map的包含所有key的set对象，遍历set对象使用get方法获取value
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        System.out.println("--------------->>> 2.键值对 <<<---------------");
        //2.使用entrySet()方法获取所有键值对返回一个集合，遍历集合获取每一个键值对
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("--------------->>> 3.lambda表达式 <<<---------------");
        //其实forEach底层还是使用的第二种方法获取的所有键值对
        map.forEach((String k, Integer v) -> System.out.println(k + " " + v));
    }
}
