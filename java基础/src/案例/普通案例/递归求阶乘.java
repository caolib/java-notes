package java基础.src.案例.普通案例;

public class 递归求阶乘 {
    public static void main(String[] args) {
        System.out.println(f(5));
        System.out.println(f(-10));
        System.out.println(f(0));

    }

    public static int f(int n) {
        if (n >= 0) {
            return n == 0 ? 1 : n * f(n - 1);
        } else {
            return -1;
        }
    }
}
