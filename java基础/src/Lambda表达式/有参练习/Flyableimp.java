package java基础.src.Lambda表达式.有参练习;

public class Flyableimp implements Flyable {
    @Override
    public void fly(String s) {
        System.out.println(s + "起飞");
    }
}
