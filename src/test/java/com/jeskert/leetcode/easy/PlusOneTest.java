package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {
    PlusOne plusOne = new PlusOne();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 3, 2, 2}, plusOne.plusOne(new int[]{4, 3, 2, 1}));
        assertArrayEquals(new int[]{1}, plusOne.plusOne(new int[]{0}));
        assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1}, plusOne.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
        assertArrayEquals(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7}, plusOne.plusOne(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6}));
    }
}
