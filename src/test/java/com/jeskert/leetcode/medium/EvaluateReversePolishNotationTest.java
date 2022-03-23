package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvaluateReversePolishNotationTest {
    EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();

    @Test
    public void test1() {
        assertEquals(9, evaluateReversePolishNotation.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    public void test3() {
        assertEquals(22, evaluateReversePolishNotation.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    @Test
    public void test2() {
        assertEquals(6, evaluateReversePolishNotation.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }
}