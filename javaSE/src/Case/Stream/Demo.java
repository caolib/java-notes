package javaSE.src.Case.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 创建一个对象，存储 "张三,24"，"李四,25"，"王五,26"三个字符串，收集年龄>=25的数据
 * 并保存到Map对象中，姓名作为键，年龄作为值，最后遍历输出数据
 */

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,24", "李四,25", "王五,26");

        Map<String, Integer> result = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 25)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0]
                        , s -> Integer.parseInt(s.split(",")[1]
                        )
                ));

        System.out.println(result);

    }
}
