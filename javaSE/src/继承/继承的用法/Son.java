package javaSE.src.继承.继承的用法;

public class Son extends Father {       //使用extends关键字实现继承
    public void method() {
        System.out.println("method方法的调用");
    }
}

//继承的利弊
//好处：提高了的代码的 复用性 和 维护性
//弊端：父类发生变化，子类也要随之变化，类之间的耦合性增强，削弱了子类的独立性
