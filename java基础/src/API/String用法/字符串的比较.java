package java基础.src.API.String用法;

public class 字符串的比较 {
    public static void main(String[] args) {
        char[] c = {'w', 'o', 'r', 'l', 'd'};
        String s1 = new String(c);
        String s2 = new String(c);
        String s3 = "world";
        String s4 = "world";
        //比较字符串地址是否相同
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println("-------");
        //比较字符串内容是否相同 equals
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));

    }
}
