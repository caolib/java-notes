package javaSE.src.案例.实验报告.实验六;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {
    /**
     * <h1 color="aqua">使用正则表达式\D表示用不是数字的所有字符当成分隔符</h2>
     */
    @Test
    public void test() {
        String str = "数学 87 分，物理 76 分，英语 96 分";
        Scanner datas = new Scanner(str);
        datas.useDelimiter("\\D+");
        float sum = 0;
        int count = 0;
        while (datas.hasNext()) {
            sum += datas.nextFloat();
            count++;
        }
        System.out.println("总成绩：" + sum);
        System.out.printf("平均成绩：%,1.2f\n", sum / count);
    }


    /**
     * <h1 color="aqua">模式匹配</h3>
     */
    @Test
    public void test2() {
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

    public static void main(String[] args) {
        String str = "数学 87 分，物理 76 分，英语 96 分";
        Scanner datas = new Scanner(str);
        datas.useDelimiter(" ");
        float sum = 0;
        int count = 0;

        while (datas.hasNext()) {
            try {
                sum += datas.nextFloat();
                count++;
            } catch (Exception ignored) {
                datas.next();
            }
        }
        System.out.println("总成绩：" + sum);
        System.out.printf("平均成绩：%,1.2f\n", sum / count);
    }

}
