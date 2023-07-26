package javaSE.src.Case.实验报告.实验六;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3实验报告 {
    public static void main(String[] args) {
        String str = "数学 87 分，物理 76 分，英语 96 分";
        String regex1 = "-?[1-9][0-9]*[.]?[0-9]*";
        //定义的模式
        Pattern p = Pattern.compile(regex1);
        //模式对象
        Matcher m = p.matcher(str);
        //匹配对象
        float sum = 0;
        int count = 0;

        while (m.find()) {
            String item = m.group();
            sum += Float.parseFloat(item);
            count++;
        }
        System.out.println("总成绩：" + sum);
        System.out.printf("平均成绩：%,1.2f\n", sum / count);
    }
}
