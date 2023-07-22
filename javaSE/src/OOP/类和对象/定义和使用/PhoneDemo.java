package javaSE.src.OOP.类和对象.定义和使用;

//对象的使用
public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
        p.name = "小米";
        p.price = 1999;

        System.out.println(p.name);
        System.out.println(p.price);
        p.call();
        p.sendMessage();
        System.out.println(p);  //地址

    }
}
