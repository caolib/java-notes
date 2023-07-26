package javaSE.src.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 获取类中的所有构造方法
 */
public class ConstructorDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //获取指定类的字节码文件对象
        Class<Student> clazz = Student.class;

        System.out.println("--------------->>> 获取单个构造方法 <<<---------------");
        //获取单个构造方法,参数是构造方法的参数的字节码对象
        //默认构造
        Constructor<Student> con1 = clazz.getConstructor();
        System.out.println("con1 = " + con1);

        //有参构造
        Constructor<Student> con2 = clazz.getConstructor(int.class);
        System.out.println("con2 = " + con2);


        System.out.println("--------------->>> 获取全部构造方法 <<<---------------");
        //获取所有构造方法(包括私有，getConstructors()->获取所有public构造方法,带有Declared表示可以获取到所有权限下的成员，下同)
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("--------------->>> 使用反射实现私有构造创建对象 <<<---------------");
        Constructor<Student> con = clazz.getConstructor(String.class, int.class);
        //使用暴力反射临时取消校验权限
        con.setAccessible(true);
        Student zs = con.newInstance("张三", 21);
        System.out.println(zs);

        System.out.println("--------------->>> 获取类中成员变量 <<<---------------");
        Field[] fields = clazz.getFields();//获取所有public字段
        System.out.println(Arrays.toString(fields));

        Field[] declaredFields = clazz.getDeclaredFields();//获取所有字段
        for (Field field : declaredFields) {
            System.out.println(field);
        }

        System.out.println("--------------->>> 获取单个成员变量 <<<---------------");
        Field name = clazz.getDeclaredField("name");
        System.out.println("name = " + name);
        //获取权限修饰符对应的数字 private->2
        System.out.println(name.getModifiers());
        //获取名字
        System.out.println(name.getName());
        //获取name的类型
        System.out.println(name.getType());

        //获取对象的数字属性
        Student s = new Student("张三", 21);
        name.setAccessible(true);
        System.out.println("name= " + name.get(s));
        //修改属性的值
        name.set(s, "李四");
        System.out.println(s);

        System.out.println("--------------->>> 获取成员方法 <<<---------------");
//        Method[] methods = clazz.getMethods();//获取所有public成员方法包括父类中的方法
//        Arrays.stream(methods).forEach(System.out::println);

        Method[] declaredMethods = clazz.getDeclaredMethods();//获取所有成员方法，包括私有，但不包括父类中的方法
        Arrays.stream(declaredMethods).forEach(System.out::println);


    }
}
