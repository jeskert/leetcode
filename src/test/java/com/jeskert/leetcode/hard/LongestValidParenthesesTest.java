package com.jeskert.leetcode.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestValidParenthesesTest {
    LongestValidParentheses longestValidParentheses = new LongestValidParentheses();

    @Test
    public void test1() {
        assertEquals(2, longestValidParentheses.longestValidParentheses("(()"));
        assertEquals(4, longestValidParentheses.longestValidParentheses(")()())"));
        assertEquals(0, longestValidParentheses.longestValidParentheses(""));
    }
}