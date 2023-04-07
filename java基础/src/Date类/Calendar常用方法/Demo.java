package java基础.src.Date类.Calendar常用方法;
/*
    public abstract void add(int field,int amount.):根据日历的规侧，将指定的时间量添加或减去给定的日历字段
    public final void set(int year,int month,int date,):设置当前日历的年月日
 */

import java.util.Calendar;

public class Demo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) + 1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        //3年前
//        c.add(Calendar.YEAR, -3);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) + 1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        //10年后的5天前
        c.add(Calendar.YEAR, 10);
        c.add(Calendar.DATE, -5);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
        System.out.println("------------");

        Calendar c2 = Calendar.getInstance();
        c2.set(2077, Calendar.JUNE, 6);
        int year2 = c2.get(Calendar.YEAR);
        int month2 = c2.get(Calendar.MONTH) + 1;
        int date2 = c2.get(Calendar.DATE);
        System.out.println(year2 + "年" + month2 + "月" + date2 + "日");

    }
}
