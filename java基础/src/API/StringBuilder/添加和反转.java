package java基础.src.API.StringBuilder;

public class 添加和反转 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("hello");
        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);

        System.out.println(sb == sb2);      //append添加并返回本身，所以地址相同

        sb2.append("java");
        sb2.append("world");
        sb2.append(666);
        System.out.println(sb2);

        //链式编程思想
        StringBuilder sb3 = new StringBuilder();
        sb3.append("hello").append("world").append("java").append("666");
        System.out.println(sb3);
        sb3.reverse();
        System.out.println(sb3);


    }
}
