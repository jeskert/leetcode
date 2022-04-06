package com.jeskert.leetcode.easy;

import java.util.Stack;

public class MinStack {

    private final Stack<Integer> stack;
    private final Stack<Integer> supportStack;
    public MinStack() {
        stack = new Stack<>();
        supportStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (supportStack.isEmpty() || x < supportStack.peek()) {
            supportStack.push(x);
        }
    }

    public void pop() {
        int x = stack.pop();
        if (x == supportStack.peek()) {
            supportStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return supportStack.peek();
    }
}
