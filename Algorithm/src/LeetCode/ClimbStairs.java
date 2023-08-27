package Algorithm.src.LeetCode;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/*
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * */
public class ClimbStairs {

    public int climb_recursion(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return climb_recursion(n - 1) + climb_recursion(n - 2);
    }

    public int climb(int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        int sum = 0;
        while (!stack.empty()) {
            Integer pop = stack.pop();
            if (pop == 1) {
                sum += 1;
            } else if (pop == 2) {
                sum += 2;
            } else {
                stack.push(pop - 1);
                stack.push(pop - 2);
            }
        }
        return sum;
    }

    public int climb_promax(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int[] arr = new int[46];
        arr[n] = 1;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 3; i < arr.length; i++) {
                int val = arr[i];
                if (val != 0) {
                    flag = true;
                    arr[i - 1] += val;
                    arr[i - 2] += val;
                    arr[i] = 0;
                }
            }
        }
        return arr[1] + arr[2] * 2;
    }


    @Test
    public void test() {
        int n = 40;

        //System.out.println(climb(n));
        System.out.println(climb_recursion(n));
        System.out.println(climb_promax(n));
    }
}
