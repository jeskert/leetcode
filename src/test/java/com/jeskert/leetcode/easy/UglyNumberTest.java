package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UglyNumberTest {
    UglyNumber uglyNumber = new UglyNumber();

    @Test
    public void test1() {
        assertTrue(uglyNumber.isUgly(6));
        assertTrue(uglyNumber.isUgly(8));
        assertFalse(uglyNumber.isUgly(14));
        assertTrue(uglyNumber.isUgly(1));
    }
}
