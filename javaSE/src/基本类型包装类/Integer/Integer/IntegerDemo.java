package javaSE.src.基本类型包装类.Integer.Integer;

/*
    构造方法：
    基本类型包装类.Integer(int value)----已过时
    基本类型包装类.Integer(String s)----已过时    (此处的字符串必须是数字)

    静态方法获取对象：
    基本类型包装类.Integer.valueOf(int i)
    基本类型包装类.Integer.valueOf(String s)

 */
public class IntegerDemo {
    public static void main(String[] args) {
        /*
        过时的构造方法
        基本类型包装类.Integer i = new 基本类型包装类.Integer(100);
        System.out.println(i);

//        基本类型包装类.Integer i2 = new 基本类型包装类.Integer("66");
        基本类型包装类.Integer i2 = new 基本类型包装类.Integer("abc"); //不是数字会出现错误
        System.out.println(i2);

         */

//        基本类型包装类.Integer i = 基本类型包装类.Integer.valueOf(100); int类型可以缩写
        Integer i = 100;
        System.out.println(i);

        Integer i2 = Integer.valueOf("666");    //同样只能写数字字符串
        System.out.println(i2);


    }
}
