package javaSE.src.Reflect.动态代理;

public class Test {
    public static void main(String[] args) {
        //创建大明星对象
        BigStar kun = new BigStar("kunkun");
        //创建代理对象
        Star proxy = ProxyUtil.createProxy(kun);

        System.out.println(proxy.sing("只因你太美"));
        proxy.dance();

    }
}
