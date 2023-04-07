package java基础.src.API.StringBuilder;

public class String和StringBuilder相互转换 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

        //toString  将StringBuilder转换成String类型
        //String s = sb 是错误的，不能直接转换
        String s = sb.toString();
        System.out.println(s);

        //通过构造方法，可以将String转换成StringBuilder
        StringBuilder sb2 = new StringBuilder(s);
        System.out.println(sb2);

    }
}
