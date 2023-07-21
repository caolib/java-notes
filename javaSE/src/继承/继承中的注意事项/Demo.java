package javaSE.src.继承.继承中的注意事项;

//java只支持单继承，不支持多继承
//java支持多层继承

class Grandfather {
    public void drink() {
        System.out.println("Grandfather喝酒");
    }
}

class Father extends Grandfather {
    public void smoke() {
        System.out.println("father抽烟");
    }
}

class Mother {
    public void dance() {
        System.out.println("mother跳舞");
    }
}

class Son extends Father {
}

public class Demo {
    public static void main(String[] args) {
        Son s = new Son();
        s.smoke();
        s.drink();
    }
}
