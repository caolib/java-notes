package javaSE.src.案例.普通案例;

import java.util.Calendar;
import java.util.Scanner;

public class 二月天 {
    public static void main(String[] args) {
        //输入年份，获取该年二月有多少天
        feb_Days();
    }

    public static void feb_Days() {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("输入年份：");
        year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year, Calendar.MARCH, 1);
        c.add(Calendar.DATE, -1);
        System.out.println(year + "年的2月有 " + c.get(Calendar.DATE) + "天");
    }
}
