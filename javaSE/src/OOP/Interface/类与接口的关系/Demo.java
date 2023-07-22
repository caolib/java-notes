package javaSE.src.OOP.Interface.类与接口的关系;

//一个类继承另一个类时也可以同时实现多个接口

//接口之间是继承关系，可以单继承，也可以多继承
interface Inter extends Inter1, Inter2 {
}

public class Demo extends Object implements Inter1, Inter2, Inter3 {
}