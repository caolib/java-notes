package javaSE.src.OOP.方法;

public class 方法的定义和调用 {
    public static void main(String[] args) {
        isEvenNumber(1);
        isEvenNumber(2);

    }

    //定义格式:
    //public static void 方法名(){}

    public static void isEvenNumber(int x) {
        if (x % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
