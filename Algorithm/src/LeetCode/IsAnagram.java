package Algorithm.src.LeetCode;

import java.util.HashMap;

public class IsAnagram {
    public static void main(String[] args) {
        /*给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
        注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。*/
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
        System.out.println(strMap(s));
        System.out.println(strMap(t));

    }

    public static boolean isAnagram(String s, String t) {
        return strMap(s).equals(strMap(t));
    }

    //获取一个字符串中所有字符及其出现次数的HashMap集合
    public static HashMap<Character, Integer> strMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.compute(str.charAt(i), (k, v) -> v + 1);
            }
        }
        return map;
    }

}
