package com.jeskert.leetcode.easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }
            else if (c == '}' || c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    Character top = stack.pop();
                    if ((c == '}' && top != '{') || (c == ')' && top != '(') || (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
