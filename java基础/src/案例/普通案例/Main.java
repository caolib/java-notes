package java基础.src.案例.普通案例;

public class Main {
    public static void main(String[] args) {
/*        System.out.println(thirdMax(new int[]{1, 2, 3}));
        System.out.println(thirdMax(new int[]{2, 2, 3, 1}));
        System.out.println(thirdMax(new int[]{-2147483648, 1, 1}));*/

        System.out.println(isSubsequence("acb", "ahbgdc"));


    }

    public String replaceSpace(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                str.append("%20");
            } else {
                str.append(s.charAt(i));
            }
        }
        return String.valueOf(str);
    }

    public static boolean isSubsequence(String s, String t) {
        int j=0;
        boolean flag = false;
        for(int i=0;i<s.length();i++){
            flag = false;
            for(;j<t.length();j++){
                if(t.charAt(j)==s.charAt(i)){
                    flag = true;
                    j++;
                    break;
                }
            }
            if(!flag){
                return false;
            }
        }
        return true;
    }
}
