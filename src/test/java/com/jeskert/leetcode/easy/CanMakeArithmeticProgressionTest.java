package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanMakeArithmeticProgressionTest {
    CanMakeArithmeticProgression canMakeArithmeticProgression = new CanMakeArithmeticProgression();

    @Test
    public void test1() {
        assertTrue(canMakeArithmeticProgression.canMakeArithmeticProgression(new int[]{3, 5, 1}));
        assertFalse(canMakeArithmeticProgression.canMakeArithmeticProgression(new int[]{1, 2, 4}));
    }
}