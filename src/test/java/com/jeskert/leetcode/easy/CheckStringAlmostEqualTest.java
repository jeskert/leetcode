package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckStringAlmostEqualTest {
    CheckStringAlmostEqual checkStringAlmostEqual = new CheckStringAlmostEqual();

    @Test
    public void test1() {
        assertTrue(checkStringAlmostEqual.areAlmostEqual("bank", "kanb"));
        assertFalse(checkStringAlmostEqual.areAlmostEqual("attack", "defend"));
        assertTrue(checkStringAlmostEqual.areAlmostEqual("kelb", "kelb"));
        assertFalse(checkStringAlmostEqual.areAlmostEqual("abcd", "dcba"));
    }
}