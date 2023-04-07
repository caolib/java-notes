package java基础.src.API.异常;

/*
    try{
        可能异常的代码
    }catch(Exception e){
        输出异常信息
    }
 */

public class Demo {
    public static void main(String[] args) {
        //使用try，catch捕获异常
//        int[] arr = new int[3];
//        try {
//            System.out.println(arr[3]);//数组索引越界异常 ArrayIndexOutOfBoundsException
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        fun();

    }

    public static void fun() {
        //自定义输出索引越界异常的输出信息
        int[] arr = new int[3];
        try {
            System.out.println("开始");
            System.out.println(arr[3]);
            System.out.println("结束");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组索引越界异常," + e);
//            e.printStackTrace();
        }
    }
}
