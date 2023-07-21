package javaSE.src.API.Collection集合.不可变集合;

import java.util.List;

/**
 * 不可变集合，创建之后只能读取数据，不能删除和修改
 * 使用Xxx.of()创建不可变集合:
 * 1.List.of(...)
 * 2.Set.of(...) -> 参数必须保证唯一性，否则报错
 * 3.Map.of(...) -> (1)key必须保证唯一性，否则报错 (2)参数有上限，最多10个键值对，也就是20个参数
 */
public class Immutable {
    public static void main(String[] args) {
        List<String> list = List.of("ikun", "小黑子", "kunkun", "真爱粉");
        System.out.println(list);

        try {
            list.remove("小黑子");
        } catch (Exception e) {
            System.out.println("修改失败");
        }


    }
}
