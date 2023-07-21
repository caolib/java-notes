package javaSE.src.Date类.Date类的构造方法;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //Date()分配一个Date对象，以使它代表它被分配的时间，精确到毫秒(返回当前时间)
        Date d1 = new Date();
        System.out.println(d1);

        //Date(long date)分配一个Date对象，并将其初始化为表示从基准时间起指定的毫秒数
        long date = 1000 * 60 * 60;
        Date d2 = new Date(date);
        System.out.println(d2);

    }
}
