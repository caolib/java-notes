package javaSE.src.案例.普通案例;

public class 验证回文串II {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

        System.out.println(validPalindrome("cupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupucu"));

    }

    /**
     * 验证回文串I
     * 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样.则可以认为该短语是一个 回文串 字母和数字都属于字母数字字符。给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false
     */
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        //去除所有非字母数字的字符并改为小写
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //定义两个指针从两边向中间进行对比
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }


    /**
     * 验证回文串II
     * 给你一个字符串 s，最多 可以从中删除一个字符。
     * 请你判断 s 是否能成为回文字符串：如果能，返回 true ；否则，返回 false 。
     */
    public static boolean validPalindrome(String s) {
        return false;
    }


}
