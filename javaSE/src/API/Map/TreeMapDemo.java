package javaSE.src.API.Map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        //创建treemap对象存储Student对象，按照年龄降序排列，年龄相同按照姓名字典序排序，年龄和姓名都相同则视为同一个对象

        TreeMap<Student, String> treeMap = new TreeMap<>((o1, o2) -> {
            int num = o2.age - o1.age;
            return num == 0 ? o1.name.compareTo(o2.name) : num;
        });

        Student s1 = new Student("张三", 20);
        Student s2 = new Student("ikun", 69);
        Student s3 = new Student("kunkun", 23);
        Student s4 = new Student("ikun", 69);
        Student s5 = new Student("kun", 69);
        treeMap.put(s1, "法外狂徒");
        treeMap.put(s2, "食不食油饼");
        treeMap.put(s3, "你干嘛哈哈哎哟");
        treeMap.put(s4, "真爱粉");
        treeMap.put(s5, "真爱粉");

        treeMap.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("--------------->>> 统计出现次数 <<<---------------");
        //统计str字符串中abcde出现的次数并用字典序输出结果
        String str = "abcbdbcbebbbdcbbabbcbacbebbebbcbebcecbabeabbebcdeca";
        TreeMap<Character, Integer> tm = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int val = tm.getOrDefault(c, 0) + 1;
            tm.put(c, val);
        }


        tm.forEach((k, v) -> System.out.print(k + "(" + v + ")"));

    }
}
