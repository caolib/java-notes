package javaSE.src.可变参数;

/**
 * JDK5开始
 * 1.可变参数->参数的个数可变
 * 2.格式：类型+...+变量名
 * 3.底层是将所有传入的参数存入到数组中
 * 4.注意点:
 * 4.1 一个方法中最多只能有一个可变参数(防止参数不知道属于那部分)
 * 4.2 如果有其他形参，可变参数写在形参后面，原因同上
 */
public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1, 2, 3, 4, 5));

    }

    /**
     * 求若干个int类型数据的和，具体是几个，不知道
     *
     * @param numbers 可变参数
     * @return 参数之和
     */
    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
