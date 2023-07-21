package javaSE.src.案例.普通案例;

import java.util.Stack;

public class 有效的括号 {
    public static void main(String[] args) {
        String str = "(){}[]";
        String str2 = "(){}}{";
        System.out.println(isValid(str));
        System.out.println(isValid(str2));
    }


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.empty() && (c == ')' || c == ']' || c == '}'))
                return false;
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if ((stack.peek() == '(' && c == ')') || (stack.peek() == '[' && c == ']') || (stack.peek() == '{' && c == '}')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.empty();
    }

}
