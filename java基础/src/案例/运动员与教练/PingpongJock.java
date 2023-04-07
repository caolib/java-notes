package java基础.src.案例.运动员与教练;

public class PingpongJock extends Jock implements StudyEnglish {
    public PingpongJock() {
    }

    public PingpongJock(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println(this.getName() + "学习乒乓球技巧");
    }

    @Override
    public void studyEnglish() {
        System.out.println(this.getName() + "学英语");
    }
}
