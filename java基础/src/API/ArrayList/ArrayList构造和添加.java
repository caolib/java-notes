package API.ArrayList;

import java.util.ArrayList;

//ArrayList容器与vector容器相似

public class ArrayList构造和添加 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();    //创建一个空数组对象
        System.out.println(array);

        //add尾插元素
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println(array);  //可以直接输出

        //在指定位置插入指定元素
        array.add(1, "happy");
        System.out.println(array);

    }
}
