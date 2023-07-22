package javaSE.src.Exception;

/**
 * throws -> 写在方法声明处，告诉调用者，此方法可能抛出异常
 * throw  -> 写在方法内，手动抛出异常(其实出现异常的时候会自动抛出对应异常，所以感觉有点多余,正确用法使用在没有出现异常但是你不想让代码执行下去的时候，)
 */

public class ThrowDemo {
    public static void main(String[] args) {
        //创建一个方法，求一个数组的最大值
        int[] arr = {};
        try {
            System.out.println(getMax(arr));
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("执行完毕");
    }

    public static int getMax(int[] arr) {
        if (arr == null) {
            throw new NullPointerException();
        }
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
