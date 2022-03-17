package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTwoTest {
    PowerOfTwo powerOfTwo = new PowerOfTwo();

    @Test
    public void test1() {
        assertTrue(powerOfTwo.isPowerOfTwo(1));
        assertTrue(powerOfTwo.isPowerOfTwo(16));
        assertFalse(powerOfTwo.isPowerOfTwo(3));
        assertTrue(powerOfTwo.isPowerOfTwo(4));
        assertFalse(powerOfTwo.isPowerOfTwo(5));
    }
}