package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotatedDigitsTest {
    RotatedDigits rotatedDigits = new RotatedDigits();

    @Test
    public void test1() {
        assertEquals(4, rotatedDigits.rotatedDigits(10));
    }
}
