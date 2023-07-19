package java基础.src.API.Regex;

public class RegexDemo {
    public static void main(String[] args) {
        String qq = "123456789";
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
        
    }

    //检查是否符合QQ号规则：6-20位，0不能开头，全部是数字(传统方法判断)
    public static boolean checkQQ(String qq) {
        if (qq.startsWith("0")) {
            return false;
        }

        int len = qq.length();
        if (len < 6 || len > 20) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            char c = qq.charAt(i);
            if (c > '9' || c < '0') {
                return false;
            }
        }
        return true;
    }
}
