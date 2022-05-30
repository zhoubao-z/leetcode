package leetcode_hot100;

import java.util.Stack;

public class _20有效的括号 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || (ch == ')' && stack.pop() != '(') || (ch == ']' && stack.pop() != '[') || (ch == '}' && stack.pop() != '{')) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        ;
    }
}
