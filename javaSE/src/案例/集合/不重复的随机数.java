package javaSE.src.案例.集合;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
    获取10个0~10之间不重复的随机数并输出
 */
public class 不重复的随机数 {
    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> s = new HashSet<>();

        while (s.size() < 10) {
            s.add(r.nextInt(21));
        }

        for (int i : s) {
            System.out.println(i);
        }

    }
}
