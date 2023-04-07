package java基础.src.Date类.Calendar类;

import java.util.Calendar;

/*
    Calendar为某一时刻和一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法
    Calendar提供了一个类方法getInstance用于获取Calendar对象，其日历字段已使用当前日期和时间初始化：
    Calendar rightNow Calendar.getInstance();
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        System.out.println(c);//多态的形式得到对象(Calendar是抽象类)
        //get()返回给定日历字段的值
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;  //月从0开始，所以要+1
        int date = c.get(Calendar.DATE);
        System.out.println(year + "/" + month + "/" + date);


    }
}
