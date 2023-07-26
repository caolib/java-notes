package javaSE.src.Case.运动员与教练;

public class BasketballInstructor extends Instructor {
    public BasketballInstructor() {
    }

    public BasketballInstructor(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(this.getName() + "传授篮球技巧");
    }
}
