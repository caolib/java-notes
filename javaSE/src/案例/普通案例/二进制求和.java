package javaSE.src.案例.普通案例;

public class 二进制求和 {
    public static void main(String[] args) {

    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder str = new StringBuilder(a.length() > b.length() ? a : b);
        int add = 0;//进位
        while (i != 0 || j != 0) {
            int val = Integer.parseInt(String.valueOf(a.charAt(i)) + b.charAt(i)) + add;
            if (val == 2) {
                val = 0;
                add++;
            }
            str.setCharAt(i, (char) val);
        }
        return "123";
    }
}
