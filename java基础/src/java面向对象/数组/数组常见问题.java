package java基础.src.java面向对象.数组;

public class 数组常见问题 {
    public static void main(String[] args) {
        //1、索引越界
        int[] arr = new int[3];//长度为3，索引是 0~2
        //System.out.println(arr[3]);   索引为3的数不存在

        //2、空指针异常
        int[] arr2 = new int[1];
        arr2 = null;     //让数组变量名指向null，即空值
        //System.out.println(arr[0]);  访问不了


    }
}
