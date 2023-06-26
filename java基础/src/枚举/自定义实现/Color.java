package java基础.src.枚举.自定义实现;

public class Color {

    public String rgb;

    //构造方法
    private Color(String s) {
        rgb = s;
    }
    public Color(int r, int g, int b) {
        rgb = r + ";" + g + ";" + b;
    }

    //枚举的颜色
    public static final Color Red = new Color("255;0;0");
    public static final Color Orange = new Color("255;165;0");
    public static final Color Yellow = new Color("255;255;0");
    public static final Color Green = new Color("0;255;0");
    public static final Color Blue = new Color("0;0;255");
    public static final Color Indigo = new Color("75;0;130");
    public static final Color Violet = new Color("238;130;238");

    public String str() {
        return rgb;
    }

    public static String get_color(String out, String... params) {
        int len = params.length;
        if (len == 0)
            return out;
        else if (len == 1)
            return "\033[38;2;" + params[0] + "m" + out;
        else if (len == 2)
            return "\033[38;2;" + params[0] + "\033[48;2;" + params[1] + "m" + out;
        return "\033[38;2;" + params[0] + "m\033[48;2;" + params[1] + "m" + "\033[" + params[2] + "m" + out;
    }

    public static void print_color(String out,boolean flag,String...params){
        System.out.print(get_color(out,params));
        if(flag)
            System.out.println();
    }

}
