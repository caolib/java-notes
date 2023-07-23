package javaSE.src.Thread.生产者消费者;

public class Test {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Foodie foodie = new Foodie();
        cook.start();
        foodie.start();
    }
}
