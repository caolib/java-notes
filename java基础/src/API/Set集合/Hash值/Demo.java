package java基础.src.API.Set集合.Hash值;

/*
    哈希值：
    是JDk根据对象的地址或者字符串或者数字算出来的int类型的数值
    Object类中有一个方法可以获取对象的哈希值
    public int hashCode():返回对象的哈希码值
 */
public class Demo {
    public static void main(String[] args) {
        Student s = new Student("cxk", 69);

        //public int hashCode():返回对象的哈希码值,同一个对象的哈希值是相同的
        System.out.println(s.hashCode());//1324119927
        System.out.println(s.hashCode());//1324119927

        //默认情况下，不同对象的哈希值是不同的
        //通过方法重写，可以实现不同对象的哈希值相同
        Student s2 = new Student("cxk", 20);
        System.out.println(s2.hashCode());//990368553

        System.out.println("---------");

        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("java".hashCode());//3254818
        System.out.println("hello".hashCode());//99162322
        System.out.println("---------");

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}


class Student {
    String name;
    int age;

    Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public int hashCode() {
//        return 0;
//    }
}