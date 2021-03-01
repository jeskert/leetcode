package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxDepthTest {

    MaxDepth maxDepth = new MaxDepth();

    @Test
    public void test1() {
        String s = "(1+(2*3)+((8)/4))+1";
        assertEquals(3, maxDepth.maxDepth(s));
    }

    @Test
    public void test2() {
        String s = "(1)+((2))+(((3)))";
        assertEquals(3, maxDepth.maxDepth(s));
    }

    @Test
    public void test3() {
        String s = "1+(2*3)/(2-1)";
        assertEquals(1, maxDepth.maxDepth(s));
    }

    @Test
    public void test4() {
        String s = "1";
        assertEquals(0, maxDepth.maxDepth(s));
    }

    @Test
    public void test5() {
        String s = "()";
        assertEquals(1, maxDepth.maxDepth(s));
    }
}
