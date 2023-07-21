package javaSE.src.枚举.自定义实现;

public class LightDemo {
    public static void main(String[] args) {
        Light r = Light.RED;
        System.out.println(r);//枚举.自定义实现.Light@7cca494b

        System.out.println("-----------------");

        Light2 r2 = Light2.RED;
        System.out.println(r2);
        System.out.println(r2.getName());

        r2 = Light2.YELLOW;
        System.out.println(r2);
        System.out.println(r2.getName());
        System.out.println("-----------------");

        Light3 r3 = Light3.RED;
        System.out.println(r3);
        System.out.println(r3.getName());
        r3.show();

    }
}
