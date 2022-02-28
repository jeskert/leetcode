package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class UglyNumberIITest {
    UglyNumberII uglyNumberII = new UglyNumberII();

    @Test
    public void test1() {
        assertEquals(12, uglyNumberII.nthUglyNumber(10));
        assertEquals(1, uglyNumberII.nthUglyNumber(1));
    }
}