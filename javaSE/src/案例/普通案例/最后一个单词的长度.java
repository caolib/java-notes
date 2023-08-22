package javaSE.src.案例.普通案例;

public class 最后一个单词的长度 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));
        System.out.println(lengthOfLastWord("  a  bnsd  eww    "));
    }

    public static int lengthOfLastWord(String s) {
        int len = 0;
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                flag = true;
                len++;
            } else {
                if (flag) {
                    break;
                }
            }
        }
        return len;
    }
}
