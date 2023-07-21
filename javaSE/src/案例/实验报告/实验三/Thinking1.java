package javaSE.src.案例.实验报告.实验三;

public class Thinking1 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    static String test() {
        String log = null;

        try {
//            log.length();
            log = "try";
            return log;
        } catch (Exception e) {
            log = "catch";
            System.out.println(log);
            return log;
        } finally {
            log = "finally";
            return log;
        }
    }
}
