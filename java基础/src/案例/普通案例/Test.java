package java基础.src.案例.普通案例;

import java基础.src.枚举.自定义实现.Color;

import java.io.IOException;

import static java基础.src.枚举.自定义实现.Color.get_color;
import static java基础.src.枚举.自定义实现.Color.print_color;

public class Test {
    public static void main(String[] args) throws IOException {
        String s = "123";
        //输出彩虹七种颜色
        System.out.println(get_color(s, Color.Red.str()));
        System.out.println(get_color(s, Color.Orange.str()));
        System.out.println(get_color(s, Color.Yellow.str()));
        System.out.println(get_color(s, Color.Green.str()));
        System.out.println(get_color(s, Color.Blue.str()));
        System.out.println(get_color(s, Color.Indigo.str()));
        System.out.println(get_color(s, Color.Violet.str()));

        System.out.flush();

        print_color(s,true, Color.Red.str());
        print_color(s,true, Color.Orange.str());
        print_color(s,true, Color.Yellow.str());
        print_color(s,true, Color.Green.str());
        print_color(s,true, Color.Blue.str());
        print_color(s,true, Color.Indigo.str());
        print_color(s,true, Color.Violet.str());


    }


}


