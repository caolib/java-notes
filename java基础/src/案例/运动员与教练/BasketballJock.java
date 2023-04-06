package 案例.运动员与教练;

//篮球运动员
public class BasketballJock extends Jock {
    public BasketballJock() {
    }

    public BasketballJock(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println(this.getAge() + "岁的" + this.getName() + "正在学习篮球技巧");
    }
}
