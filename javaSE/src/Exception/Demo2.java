package javaSE.src.Exception;

/**
 * <h3>捕获异常的灵魂四问</h3>
 * <ol>
 *     <li>如果try中代码没有错误，代码怎么执行？<br>
 *         -> 执行try中所有代码，catch中代码不执行</li>
 *     <li>如果try中有多个异常,代码怎么执行？<br>
 *         -> 只捕获第一个异常，然后直接跳转到catch块，try catch块外部的代码正常执行</li>
 *     <li>如果try中遇到的异常没有对应的catch块代码怎么执行？<br>
 *         -> try catch块白写，默认交给JVM处理，在控制台打印错误信息并停止程序</li>
 *     <li>如果try中有异常，异常下面的代码还会执行吗？<br>
 *         -> 不会，捕获异常后直接跳转到catch块中</li>
 * </ol>
 * <p>
 * 多个catch块中异常如果有父子关系，父在子下面，而且从JDK7开始一个catch可以捕获多种异常
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String str = null;

        try {
            System.out.println(str.equals("123"));//空指针异常
            System.out.println(arr[10]);//索引越界异常
            System.out.println(1 / 0);//除0异常
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("索引越界异常或者计算异常");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
        System.out.println("执行完毕");
    }
}
