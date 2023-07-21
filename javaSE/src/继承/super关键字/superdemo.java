package javaSE.src.继承.super关键字;

class Fu {
    // 父类属性：年龄
    public int age = 40;
}

// 定义子类
class Zi extends Fu {
    // 子类属性：身高
    public int height = 175;
    // 子类属性：年龄
    public int age = 20;

    // 子类方法，展示所有属性值
    public void show() {
        // 局部变量：年龄
        int age = 69;
        // 打印局部变量年龄
        System.out.println("age = " + age);
        // 打印当前对象的年龄属性值
        System.out.println("this.age = " + this.age);
        // 打印父类的年龄属性值，使用super关键字
        System.out.println("super.age = " + super.age);
        // 打印子类的身高属性值
        System.out.println("height = " + height);
    }
}

public class superdemo {
    public static void main(String[] args) {
        // 创建子类对象
        Zi z = new Zi();
        // 调用子类方法展示属性值
        z.show();
    }
}
