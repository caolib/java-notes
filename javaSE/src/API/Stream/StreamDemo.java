package javaSE.src.API.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * 1.stream()     获取流对象
 * 2.filter(...)  过滤，参数为过滤规则(可以使用lambda表达式实现，返回值为boolean,false->被过滤)
 * 3.limit(i)     获取前i个元素
 * 4.skip(i)      跳过前i个元素
 * 5.distinct()   去除重复元素
 * 6.concat(a,b)  合并两个流为一个新的流，两个流的数据类型最好一致，否则新流数据类型变为ab共同父类类型
 * 7.map(func)    数据类型转换
 */

public class StreamDemo {
    public static void main(String[] args) {
        System.out.println("--------------->>> 单列集合 <<<---------------");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "张三丰", "蔡徐坤", "张无忌", "ikun");
        //从数组中找出所有”张“开头并且长度为3的字符串并输出
        list.stream()
                .filter(str -> str.startsWith("张"))
                .filter(str -> str.length() == 3)
                .forEach(System.out::println);

        System.out.println("--------------->>> 双列集合 <<<---------------");
        //双列集合不能直接使用stream方法
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("a", 1);
        hm.put("b", 2);
        hm.put("c", 3);
        hm.put("d", 4);

        //1.获取Set对象
        hm.keySet().stream()
                .forEach(System.out::println);

        //2.获取Entry对象
        hm.entrySet().stream()
                .filter(o -> o.getValue() != 1)
                .forEach(System.out::println);

        System.out.println("--------------->>> 普通数组 <<<---------------");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);


        System.out.println("--------------->>> 零散数据 <<<---------------");
        Stream.of(1, 2, 3, "asd", 6.6, true)
                .forEach(System.out::println);

        System.out.println("--------------->>> limit <<<---------------");
        Arrays.stream(arr)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("--------------->>> skip <<<---------------");
        Arrays.stream(arr)
                .skip(5)
                .forEach(System.out::println);

        System.out.println("--------------->>> distinct <<<---------------");
        arr[1] = 1;
        arr[2] = 1;
        System.out.println(Arrays.toString(arr));
        Arrays.stream(arr)
                .distinct()
                .forEach(o -> System.out.print(o + "  "));
        System.out.println();

        System.out.println("--------------->>> concat <<<---------------");
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        Collections.addAll(a1, 1, 2, 3);
        Collections.addAll(a2, 4, 5, 6);

        Stream.concat(a1.stream(), a2.stream()).forEach(System.out::println);

        System.out.println("--------------->>> map <<<---------------");
        ArrayList<String> lst = new ArrayList<>();
        Collections.addAll(lst, "张三-20", "ikun-21", "kunkun-30");

        lst.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(System.out::println);

    }
}
