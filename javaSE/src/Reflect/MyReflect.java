package javaSE.src.Reflect;

/**
 * 获取class对象的三种方式
 * <ol>
 *   <li>Class.forName(包名+类名) -> 不要加文件后缀，使用点进行分隔</li>
 *   <li>类名.class</li>
 *   <li>对象.getClass()</li>
 * </ol>
 */
public class MyReflect {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("--------------->>> 1 <<<---------------");
        Class clazz = Class.forName("javaSE.src.Reflect.Student");
        System.out.println(clazz);

        System.out.println("--------------->>> 2 <<<---------------");
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        System.out.println("--------------->>> 3 <<<---------------");
        Class clazz3 = new Student().getClass();
        System.out.println(clazz3);
    }
}
