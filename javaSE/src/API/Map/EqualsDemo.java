package javaSE.src.API.Map;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EqualsDemo {
    public static void main(String[] args) {
        /*
         * 创建一个hashmap对象，键是Student，值是String，当Student的name和age属性一样时认为是同一个学生
         */
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("ikun", 69);
        Student s3 = new Student("kunkun", 23);
        Student s4 = new Student("ikun", 69);

        HashMap<Student, String> hm = new HashMap<>();
        hm.put(s1, "法外狂徒");
        hm.put(s2, "食不食油饼");
        hm.put(s3, "你干嘛哈哈哎哟");
        hm.put(s4, "我是真爱粉");

        System.out.println("--------------->>> 1 <<<---------------");
        for (Student student : hm.keySet()) {
            System.out.println(student + " " + hm.get(student));
        }

        System.out.println("--------------->>> 2 <<<---------------");
        for (Map.Entry<Student, String> entry : hm.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("--------------->>> 3 <<<---------------");
        hm.forEach((stu, str) -> System.out.println(stu + " " + str));

        System.out.println("--------------->>> 统计次数 <<<---------------");
        //统计次数，随机在abcd中生成10000个数据，统计abcd生成的次数
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = {"A", "B", "C", "D"};
        int len = arr.length;
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            String s = arr[random.nextInt(len)];
            int val = map.getOrDefault(s, 0) + 1;
            map.put(s, val);
        }

        map.forEach((String s, Integer i) -> System.out.println(s + ":" + i));
    }
}
