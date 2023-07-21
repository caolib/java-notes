package javaSE.src.API.Date类.Date常用方法;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        //getTime()  返回从 1970/1/1 GMT 到现在的毫秒值
        Date d1 = new Date();
        System.out.println("距今" + d1.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        //setTime(long date)
        long date = 1000 * 60 * 60;
        d1.setTime(date);
        System.out.println(d1);

        d1.setTime(System.currentTimeMillis());
        System.out.println(d1);


    }
}
