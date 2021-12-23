package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountingBitsTest {
    CountingBits countingBits = new CountingBits();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1, 1}, countingBits.countBits(2));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, countingBits.countBits(5));
    }
}