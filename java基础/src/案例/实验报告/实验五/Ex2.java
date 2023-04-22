package java基础.src.案例.实验报告.实验五;

/**
 * 2. 编写名为IParent的接口，其中声明add(String s1,String s2)和minus(String s1,String s2)方法，返回值均为int型；编写Child类继承IParent接口，并实现add和minus方法，要求当主方法中执行如下代码时：
 * IParent c=new Child();
 * System.out.println(c.add("12","34"));
 * System.out.println(c.minus("123","12"));		结果为：
 * 46
 * 111
 */

interface IParent {
    int add(String s1, String s2);

    int minus(String s1, String s2);
}

class Child implements IParent {
    @Override
    public int add(String s1, String s2) {
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }

    @Override
    public int minus(String s1, String s2) {
        return Integer.parseInt(s1) - Integer.parseInt(s2);
    }
}

public class Ex2 {
    public static void main(String[] args) {
        IParent c = new Child();
        System.out.println("结果为：");
        System.out.println(c.add("12", "34"));
        System.out.println(c.minus("123", "12"));
    }
}
