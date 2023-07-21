package javaSE.src.Date类.SimpleDateFormat类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    构造方法：
    public SimpleDateFormat():构造一个SimpleDateFormat,使用默认模式和日期格式
    public SimpleDateFormat(String pattern):构造一个SimpleDateFormat使用给定的模式和默认的日期格式

    格式化：从Date到String
    public final String format(Date date,):将日期格式化成日期/时间字符串

    解析：从String到Date
    public Date parse(String source):从给定字符串的开始解析文本以生成日期
 */
public class Demo {
    public static void main(String[] args) throws ParseException {
        //格式化：Date --> String
        Date d1 = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String str = sdf.format(d1);
        System.out.println(str);
        System.out.println("-----------");

        //String --> Date
        String s = "2023/02/05 06:06:06";//时间模式必须和sdf2的模式相匹配
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d2 = sdf2.parse(s);
        System.out.println(d2);


    }
}
