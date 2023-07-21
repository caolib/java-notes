package javaSE.src.基本类型包装类.自动装箱和拆箱;

/*
    装箱：将基本数据类型装换成对应的包装类类型
    拆箱：将包装类类型转换成对应的基本数据类型
*/
public class Demo {
    public static void main(String[] args) {
        //装箱
        Integer i = Integer.valueOf(100);
        //自动装箱
        Integer i2 = 100;

        //拆箱
        int i3 = i2.intValue() + 666;
        System.out.println(i3);
        //自动拆箱
        int i4 = i2 + 100;  //其实只是简化了，底层实现还是调用了intValue()方法
        System.out.println(i4);

        //问题
        Integer x = null;
        if (x != null) {
            x += 10;    //当Integer对象是null时，不能直接相加
        }
        System.out.println(x);

        //建议：只要是对象，在使用前必须进行不为null的判断


    }
}
