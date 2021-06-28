package com.jeskert.leetcode.easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty() && isPair(stack.peek(), s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    private boolean isPair(char a, char b) {
        if (a == '{' && b == '}') {
            return true;
        } else if (a == '(' && b == ')') {
            return true;
        } else return a == '[' && b == ']';
    }
}
