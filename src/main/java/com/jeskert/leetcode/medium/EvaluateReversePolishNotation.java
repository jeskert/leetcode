package com.jeskert.leetcode.medium;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String element = tokens[i];
            if (!(element.equals("+") || element.equals("-") || element.equals("/")|| element.equals("*"))) {
                stack.push(Integer.valueOf(element));
            } else {
                int second = stack.pop();
                int first = stack.pop();
                int res = 0;
                switch (element) {
                    case "+":
                        res = first + second;
                        break;
                    case "-":
                        res = first - second;
                        break;
                    case "*":
                        res = first * second;
                        break;
                    case "/":
                        res = first / second;
                        break;
                    default:
                        break;
                }
                stack.push(res);
            }
        }
        return stack.peek();
    }
}
