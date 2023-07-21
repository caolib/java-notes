package javaSE.src.案例.Stream;

/*
    第一个集合中：存储6名男演员的名字和年龄。
    第二个集合中:存储6名女演员的名字和年龄。
    姓名和年龄中间用逗号隔开。比如：张三,23
    要求完成如下的操作：
        1.男演员只要名字为3个字的前两人
        2.女演员只要姓杨的，并且不要第一个
        3.把过滤后的男演员姓名和女演员姓名合并到一起
        4.将上一步的演员信息封装成Actor对象。
        5.将所有的演员对象都保存到List集合中。
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        ArrayList<String> man = new ArrayList<>();
        ArrayList<String> women = new ArrayList<>();
        Collections.addAll(man, "蔡徐坤,25", "JOJO,30", "马保国,69", "张三丰,100", "张无忌,39", "Dio,999");
        Collections.addAll(women, "杨秘,40", "刘失,35", "黄龙,34", "杨影,36", "赵立影,30", "蔡坤坤,28");

        Stream<String> stream1 = man.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);
        Stream<String> stream2 = women.stream().filter(s -> s.startsWith("杨")).skip(1);

        List<Actor> result = Stream.concat(stream1, stream2).map(s -> {
            String[] strings = s.split(",");
            return new Actor(strings[0], Integer.parseInt(strings[1]));
        }).toList();
        result.forEach(System.out::println);

    }

}
