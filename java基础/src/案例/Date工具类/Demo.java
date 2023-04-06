package 案例.Date工具类;

import java.text.ParseException;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        //定义时间格式
        String pattern = "yyyy/MM/dd HH:mm:ss";

        Date d1 = new Date();
        System.out.println("现在时间是：" + DateUtils.dateToString(d1, pattern));

        String s = "1970/01/01 00:00:00";
        System.out.println("解析的时间是：" + DateUtils.stringToDate(s, pattern));

        System.out.println("-------------");

        String pattern2 = "yyyy年MM月dd日 HH:mm:ss";
        String pattern3 = "HH:mm:ss";

        System.out.println("现在时间是：" + DateUtils.dateToString(d1, pattern2));
        System.out.println("现在时间是：" + DateUtils.dateToString(d1, pattern3));

        String s2 = "1970年01月01日 00:00:00";
        System.out.println("解析的时间是：" + DateUtils.stringToDate(s2, pattern2));

    }
}
