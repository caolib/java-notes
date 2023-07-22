package javaSE.src.Exception;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name 姓名
     */
    public void setName(String name) {
        if (name.length() < 2 || name.length() > 4) {
            throw new NameFormatException(name + "有误！长度应该介于2~4");
        }
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new AgeOutOfBoundException(age + "有误，应该介于0~100");
        }
        this.age = age;
    }

    public String toString() {
        return "name = " + name + ", age = " + age;
    }
}
