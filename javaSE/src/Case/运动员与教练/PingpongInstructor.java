package javaSE.src.Case.运动员与教练;

public class PingpongInstructor extends Instructor implements StudyEnglish {
    public PingpongInstructor() {
    }

    public PingpongInstructor(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(this.getName() + "传授乒乓球技巧");
    }

    @Override
    public void studyEnglish() {
        System.out.println(this.getName() + "学英语");
    }
}

