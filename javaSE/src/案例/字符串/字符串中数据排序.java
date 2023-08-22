package javaSE.src.案例.字符串;
/*
    有一个字符串“91 27 46 38 50”，实现从小到大排序，输出“27 38 46 50 91”
 */

import java.util.Arrays;

public class 字符串中数据排序 {
    public static void main(String[] args) {
        String str = "91 27 46 38 50";
        System.out.println("排序前：");
        System.out.println(str);
        int[] array = new int[5];
        int n = 0;
        for (int i = 0; i < str.length(); i += 3) {
            array[n] = Integer.parseInt(String.valueOf(str.charAt(i)) + str.charAt(i + 1));
            n++;
        }
        Arrays.sort(array);
        String target = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                target += String.valueOf(array[i]);
            } else {
                target += String.valueOf(array[i]);
                target += " ";
            }
        }
        System.out.println("排序后：\n" + target);


    }
}
