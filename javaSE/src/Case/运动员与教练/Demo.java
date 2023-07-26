package javaSE.src.Case.运动员与教练;

public class Demo {
    public static void main(String[] args) {
        BasketballJock bj = new BasketballJock("cxk", 25);
        bj.eat();
        bj.learn();
        System.out.println("------------");

        PingpongJock pj = new PingpongJock();
        pj.setName("张三");
        pj.setAge(19);
        pj.eat();
        pj.learn();
        pj.studyEnglish();
        System.out.println("------------");


        BasketballInstructor bi = new BasketballInstructor("李四", 69);
        bi.eat();
        bi.teach();
        System.out.println("------------");

        PingpongInstructor pi = new PingpongInstructor("老六", 66);
        pi.eat();
        pi.teach();
        pi.studyEnglish();


    }
}
