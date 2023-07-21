package javaSE.src.API.String用法;

public class String构造方法 {
    public static void main(String[] args) {
        //创建一个空白字符串，没有任何内容
        String s1 = new String();
        System.out.println("s1:" + s1);

        //根据字符数组内容创建字符串对象
        char[] chs = {'s', 'a', 'b', 'e', 'r'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        //根据字节数组内容创建字符串对象
        byte[] b = {97, 98, 99};    //根据ASCII值转换成相应的字符
        String s3 = new String(b);
        System.out.println("s3:" + s3);

        //直接赋值（推荐）
        String s4 = "Master";
        System.out.println("s4:" + s4);


    }
}
