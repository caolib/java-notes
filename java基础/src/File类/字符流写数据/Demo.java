package File类.字符流写数据;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
构造方法：
    OutputStreamWriter(OutputStream out):仓创建一个使用默认字符编码的DutputStreamWriter
    写数据的5种方式：
    void write(int c):写一个字符
    void write(char[] cbuf):写入一个字符数组
    void write(char[] cbuf,int off,int len,):写入字符数组的一部分
    void write(String str):写一个字符串
    void write(String str,int off,int Len):写-个字符串的-部分
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/files/java.txt"));
        //1、写一个字符
//        osw.write(97);
//        osw.flush();//刷新

        //2、写一个字符数组
        char[] chs = {'a', 'b', 'c', 'd', 'e'};
//        osw.write(chs);

        //3、写字符数组的部分数据
//        osw.write(chs, 1, 2);//参数为开始索引和长度

        //4、写一个字符串
//        osw.write("你干嘛哈哈哎哟");

        //5、写一个字符串的部分数据
        osw.write("你干嘛哈哈哎哟", 0, 3);


        osw.close();

    }
}
