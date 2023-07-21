package javaSE.src.API.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1.stream()     获取流对象
 * <p>
 * 中间方法：使用后返回的对象还是Stream，可以多次使用，可链式编程
 * <ul>
 *     <li>2.filter(...)  过滤，参数为过滤规则(可以使用lambda表达式实现，返回值为boolean,false->被过滤)</li>
 *     <li>3.limit(i)     获取前i个元素</li>
 *     <li>4.skip(i)      跳过前i个元素</li>
 *     <li>5.distinct()   去除重复元素</li>
 *     <li>6.concat(a,b)  合并两个流为一个新的流，ab二流的类型最好一致，否则新流数据类型变为ab共同父类类型</li>
 *     <li>7.map(func)    数据类型转换</li>
 * </ul>
 * <p>
 * 终结方法：使用后返回值不是Stream，不能再使用中间方法
 * <ul>
 *     <li>8.forEach()    遍历流中所有数据</li>
 *     <li>9.count()      统计流中数据个数</li>
 *     <li>10.toArray(..) 收集数据返回数组</li>
 *     <li>11.collect()   收集数据返回集合</li>
 * </ul>
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

        System.out.println("--------------->>> count <<<---------------");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.stream(array).count());

        System.out.println("--------------->>> toArray <<<---------------");
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "ikun", "kunkun", "张三");
        //toArray()无参时返回Object[]数组
/*        Object[] tar = arrayList.stream().limit(2).toArray();
        System.out.println(Arrays.toString(tar));*/

        //IntFunction的泛型：具体类型的数组
        //apply形参：数据个数
        //apply返回值：流数据数组
        /*String[] target = arrayList.stream().limit(2).toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(target));*/

        //lambda表达式实现
        String[] target2 = arrayList.stream()
                .limit(2)
                .toArray(value -> new String[value]);
        System.out.println(Arrays.toString(target2));


        System.out.println("--------------->>> collect <<<---------------");
        ArrayList<String> l = new ArrayList<>();
        Collections.addAll(l, "张三-男-20", "李四-男-40", "kun-女-25", "ikun-男-69");

        //收集到List集合中(男)
        List<String> tarList = l.stream().
                filter(o -> "男".equals(o.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println("tarList = " + tarList);

        //收集到Set集合中(男)
        Set<String> tarSet = l.stream()
                .filter(o -> "男".equals(o.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println("tarSet = " + tarSet);

        //收集到Map中(男作为键，符合的数据作为值)
        //注意键不能重复，否则报错
        /*Map<String, Integer> tarMap = l.stream()
                .filter(o -> "男".equals(o.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        //返回姓名作为键
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        //返回年龄作为值
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));
        System.out.println("tarMap = " + tarMap);*/
        //lamda表达式实现
        Map<String, Integer> tarMap = l.stream()
                .filter(o -> "男".equals(o.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],//键
                        s -> Integer.parseInt(s.split("-")[2])));//值
        System.out.println("tarMap = " + tarMap);

    }
}
