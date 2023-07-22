package javaSE.src.Exception;

/**
 * JVM默认处理异常的方式
 * <ol>
 *     <li>把异常的名称、原因、出现位置输出在控制台</li>
 *     <li>停止程序运行，之后的代码不再执行</li>
 * </ol>
 * <p>
 * 自己处理异常
 * <code>
 *         try {
 *           可能出现异常的代码
 *      } catch (异常类名 异常变量) {
 *           异常的处理代码
 *      }
 * </code>
 * <br>好处：可以让程序继续往下执行，不会停止
 */

public class Demo {
    public static void main(String[] args) {
        /*
        int a = 10, b = 0;
        System.out.println(division(a, b));
        */

        System.out.println("即将出现异常...");
        int[] arr = new int[5];
        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println("<索引越界异常>");
        }
        System.out.println("看我执行了吗？");

    }

    public static double division(double a, double b) {
        if (b == 0)
            //除数为0时抛出一个运行时异常
            throw new RuntimeException();
        return a / b;
    }
}
