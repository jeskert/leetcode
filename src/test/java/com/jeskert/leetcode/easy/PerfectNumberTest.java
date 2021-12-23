package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectNumberTest {
    PerfectNumber perfectNumber = new PerfectNumber();

    @Test
    public void test1() {
        assertTrue(perfectNumber.checkPerfectNumber(28));
        assertTrue(perfectNumber.checkPerfectNumber(6));
        assertTrue(perfectNumber.checkPerfectNumber(496));
        assertTrue(perfectNumber.checkPerfectNumber(8128));
        assertFalse(perfectNumber.checkPerfectNumber(2));
    }
}