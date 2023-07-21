package javaSE.src.API.StringBuilder;

public class StringBuilder构造方法 {
    public static void main(String[] args) {
        //创建空白字符串对象
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb长度：" + sb.length());

        //根据字符串内容创建对象
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2:" + sb2);
        System.out.println("sb2长度：" + sb2.length());


    }
}
