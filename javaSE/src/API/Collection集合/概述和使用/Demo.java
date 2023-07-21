package javaSE.src.API.Collection集合.概述和使用;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        //Collection 是抽象类，利用多态的方式创建对象
        Collection<String> c = new ArrayList<String>();

        //添加元素 add(E e)
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);


    }
}
