package API.Object.equals方法;

public class Student {
    public String name;
    public int age;

    public Student() {
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

    @Override
    public boolean equals(Object o) {
        /*
            this----s1
            o   ----s2
         */
        //首先比较地址，如果地址相同，直接返回true
        if (this == o) return true;
        //判断参数是否为null
        //判断两个对象是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;

        //向下转型
        Student student = (Student) o;  //student---s2

        //判断年龄是否相同
        if (age != student.age) return false;
        //判断姓名是否相同
        return name != null ? name.equals(student.name) : student.name == null;

    }

}
