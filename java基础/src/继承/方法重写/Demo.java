package 继承.方法重写;

class Phone {
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }
}

class NewPhone extends Phone {
    @Override   //注解，用于检查重写方法的声明的正确性
    public void call(String name) {
        System.out.println("开启视频功能");
//        System.out.println("给" + name + "打电话");
        super.call(name);
    }
}

public class Demo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("坤坤");
        System.out.println("-------------");
        NewPhone np = new NewPhone();
        np.call("坤坤");

    }
}

//重写注意事项
//1、父类中私有方法不能重写
//2、子类中重写的方法权限应 不高于 父类中的权限
//权限：public > protected > 包访问权限(默认) > private
