package java基础.src.File类.编码解码问题;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
编码：
    byte[]getBytes():使用平台的默认字符集将该String编码为一系列字节，将结果存储到新的字节数组中
    byte[]getBytes(String charsetName):使用指定的字符集将该String编码为一系列字节，将结果存储到新的字节数组中
解码：
    String(byte[] bytes):通过使用平台的默认字符集解码指定的字节数组来构造新的String
    String(byte[] bytes,String charsetName):通过指定的字符集解码指定的字节数组来构造新的String

    注意：编码和解码规则必须相同，否则会乱码
 */
public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String words = "鸡你太美";
        //默认编码为UTF-8
//        byte[] bytes = words.getBytes();//[-23, -72, -95, -28, -67, -96, -27, -92, -86, -25, -66, -114]
//        byte[] bytes = words.getBytes("UTF-8");//[-23, -72, -95, -28, -67, -96, -27, -92, -86, -25, -66, -114]
        byte[] bytes = words.getBytes("GBK");//[-68, -90, -60, -29, -52, -85, -61, -64]
        System.out.println(Arrays.toString(bytes));

        //解码
//        String str = new String(bytes);
//        String str = new String(bytes, "UTF-8");
        String str = new String(bytes, "GBK");

        System.out.println(str);


    }
}
