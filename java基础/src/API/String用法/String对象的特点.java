package API.String用法;

public class String对象的特点 {
    public static void main(String[] args) {
        char[] c = {'w', 'o', 'r', 'l', 'd'};
        //构造方法得到对象
        String s1 = new String(c);
        String s2 = new String(c);
        System.out.println(s1 == s2);

        //直接赋值得到对象
        String s3 = "world";
        String s4 = "world";
        System.out.println(s3 == s4);

        //比较地址是否相同
        System.out.println(s1 == s3);

        //new创建的是不同的地址，直接赋值的是同一个地址

    }
}
