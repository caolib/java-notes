package javaSE.src.Exception;

/**
 * 异常对象的常用方法
 * <ol>
 *   <li>getMessage()       简单错误信息</li>
 *   <li>toString()         简单错误信息</li>
 *   <li>printStackTrace()  详细错误信息，以红色字体输出(System.err)，但并不会停止程序执行，最实用</li>
 * </ol>
 */

public class FunctionDemo {
    public static void main(String[] args) {
        int[] arr = new int[1];
        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("执行完毕");
        System.err.println(">> printStackTrace()函数使用的是err错误流输出所以是红色 <<");
    }
}
