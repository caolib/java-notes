package java基础.src.API.Object.toString方法;

//查看方法：选中方法，Ctrl+B查看源码

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("cxk");
        s.setAge(30);
        System.out.println(s);  //API.Object.toString方法.Student@4eec7777
        //建议所有子类重写toString方法
        System.out.println(s.toString());

/*        public void println(Object x) {
            String s = String.valueOf(x);
            if (getClass() == PrintStream.class) {
                writeln(String.valueOf(s));
            } else {
                synchronized (this) {
                    print(s);
                    newLine();
                }
            }
        }*/

/*        public static String valueOf(Object obj) {
                return (obj == null) ? "null" : obj.toString();
        }*/

/*        public String toString() {
            return getClass().getName() + "@" + 基本类型包装类.Integer.toHexString(hashCode());
        }*/

    }
}
