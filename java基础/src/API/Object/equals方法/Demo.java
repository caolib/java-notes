package API.Object.equals方法;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("cxk", 25);
        Student s2 = new Student("cxk", 25);

        //比较两个对象的内容是否相同
//        System.out.println(s1 == s2); 比较的是地址值，new创建出来的两个对象必定不同

        System.out.println(s1.equals(s2));
        //equals默认还是用比较地址值，需要重写equals方法
        /*
        public boolean equals(Object obj) {
            return (this == obj);
        }
         */

    }
}
