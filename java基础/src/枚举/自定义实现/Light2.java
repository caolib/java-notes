package java基础.src.枚举.自定义实现;

public class Light2 {
    //创建三个实例
    public static final Light2 RED = new Light2("红");
    public static final Light2 GREEN = new Light2("绿");
    public static final Light2 YELLOW = new Light2("黄");

    private String name;

    private Light2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Light2{" +
                "name='" + name + '\'' +
                '}';
    }

}
