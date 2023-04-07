package java基础.src.基本类型包装类.Integer.int和String互相转换;

/*
    String.valueOf(int num)     int --> String
    基本类型包装类.Integer.parseInt(String s)  String --> int
 */
public class Demo {
    public static void main(String[] args) {
        //int --> String
        int num = 100;
        //方式1(简单但不专业)
        String s = "" + num;
        System.out.println("s = " + s);
        //方式2
        String s2 = String.valueOf(num);
        System.out.println("s2 = " + s2);

        System.out.println("-----------");

        //String --> int
        String str = "666";
        //方式1：String --> 基本类型包装类.Integer --> int
        Integer i = Integer.valueOf(str);
        int i2 = i.intValue();
        System.out.println("i2 = " + i2);
        //方式2：String --> int
        int x = Integer.parseInt(str);
        System.out.println("x = " + x);

    }
}
