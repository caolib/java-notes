package javaSE.src.File类.递归;

/*
    利用递归少量代码即可解决重复运算问题
    分析：
    设第n个数是f(n)=f(n-1)+f(n-2)
    f(n-1)=f(n-2)+f(n-3),f(n-2)=f(n-3)+f(n-4)
    ······
    f(3)=f(2)+f(1)
    f(2)=f(1)=1     n==1和n==2是出口
    注意：使用递归时，必须要有出口，且问题规模较小(因为递归效率不高)
 */
public class Demo {
    public static void main(String[] args) {
        //斐波那契数列 1,1,2,3,5,8,13······
        //利用递归的方法求第n个数是多少
        System.out.println(recursion(3));
        System.out.println(recursion(20));


    }

    public static int recursion(int n) {
        return n == 1 || n == 2 ? 1 : recursion(n - 1) + recursion(n - 2);
    }
}
