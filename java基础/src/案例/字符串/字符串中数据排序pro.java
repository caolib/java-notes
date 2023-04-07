package java基础.src.案例.字符串;

import java.util.Arrays;

/*
    有一个字符串“91 27 46 38 50”，实现从小到大排序，输出“27 38 46 50 91”
    字符串分割方法 字符串.split("标志")
*/
public class 字符串中数据排序pro {
    public static void main(String[] args) {
        String str = "91 27 46 38 50";
        System.out.println("排序前：");
        System.out.println(str);

        String[] strings;
        int[] array = new int[5];

        //将字符串以" "为标志分割并返回字符串数组
        strings = str.split(" ");

        //字符串数组转换成int数组
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(strings[i]);
        }
        //排序
        Arrays.sort(array);

        StringBuilder target = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                target.append(array[i]);
            } else {
                target.append(array[i]).append(" ");
            }
        }
        System.out.println("排序后：\n" + target);


    }
}
