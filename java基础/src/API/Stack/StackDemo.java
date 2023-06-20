package java基础.src.API.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 将元素压入栈中
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 从栈中弹出元素
        int element = stack.pop();
        System.out.println("弹出的元素为：" + element);

        // 查看栈顶元素
        int topElement = stack.peek();
        System.out.println("栈顶元素为：" + topElement);

        // 判断栈是否为空
        boolean isEmpty = stack.isEmpty();
        System.out.println("栈是否为空：" + isEmpty);

        // 获取栈的大小
        int size = stack.size();
        System.out.println("栈的大小为：" + size);
    }
}
