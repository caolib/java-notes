package javaSE.src.方法引用;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 方法引用的前提条件：
 * <ol>
 *     <li>方法已经存在</li>
 *     <li>方法的参数和返回值和需要重写的抽象方法一致</li>
 *     <li>方法的功能和抽象方法能达到一样的效果</li>
 * </ol>
 */

public class FunctionDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");
        //将列表中的数据全部变成int类型

        //使用Integer::parseInt方法引用代替lambda表达式的实现过程
        list.stream()
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}
