package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumChangeToMakeAlternatingBinaryStringTest {
    MinimumChangeToMakeAlternatingBinaryString minimumChangeToMakeAlternatingBinaryString = new MinimumChangeToMakeAlternatingBinaryString();

    @Test
    public void test1() {
        assertEquals(1, minimumChangeToMakeAlternatingBinaryString.minOperation("0100"));
    }

    @Test
    public void test2() {
        assertEquals(0, minimumChangeToMakeAlternatingBinaryString.minOperation("10"));
    }

    @Test
    public void test3() {
        assertEquals(2, minimumChangeToMakeAlternatingBinaryString.minOperation("1111"));
    }

}