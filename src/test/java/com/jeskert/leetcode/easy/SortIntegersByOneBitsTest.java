package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortIntegersByOneBitsTest {
    SortIntegersByOneBits sortIntegersByOneBits = new SortIntegersByOneBits();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1, 2, 4, 8, 3, 5, 6, 7}, sortIntegersByOneBits.sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
        assertArrayEquals(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}, sortIntegersByOneBits.sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1}));
        assertArrayEquals(new int[]{10000, 10000}, sortIntegersByOneBits.sortByBits(new int[]{10000, 10000}));
        assertArrayEquals(new int[]{2, 3, 5, 17, 7, 11, 13, 19}, sortIntegersByOneBits.sortByBits(new int[]{2, 3, 5, 7, 11, 13, 17, 19}));
        assertArrayEquals(new int[]{10, 100, 10000, 1000}, sortIntegersByOneBits.sortByBits(new int[]{10, 100, 1000, 10000}));
    }
}