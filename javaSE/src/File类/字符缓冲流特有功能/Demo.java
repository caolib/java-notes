package javaSE.src.File类.字符缓冲流特有功能;

import java.io.*;

/*
    BufferedWriter:
    void newLine():写一行行分隔符，行分隔符字符串由系统属性定义
    BufferedReader:
    public String readline():读一行文字。
    结果包含行的内容的字符串，不包括任何行终止字符，如果流的结尾已经到达，则为null
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/File类/bw.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write(String.valueOf(i));
//            bw.write("\r\n");
            bw.newLine();//对比于自己写换行符，newLine可以根据系统写入相应的换行符
        }
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("src/File类/bw.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}
