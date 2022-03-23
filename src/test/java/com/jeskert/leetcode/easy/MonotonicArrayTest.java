package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonotonicArrayTest {
    MonotonicArray monotonicArray = new MonotonicArray();

    @Test
    public void test1() {
        assertTrue(monotonicArray.isMonotonic(new int[]{1, 2, 2, 3}));
        assertTrue(monotonicArray.isMonotonic(new int[]{6, 5, 4, 4}));
        assertFalse(monotonicArray.isMonotonic(new int[]{1, 3, 2}));
        assertFalse(monotonicArray.isMonotonic(new int[]{2, 2, 2, 1, 4, 5}));
        assertFalse(monotonicArray.isMonotonic(new int[]{11, 11, 9, 4, 3, 3, 3, 1, -1, -1, 3, 3, 3, 5, 5, 5}));
        assertFalse(monotonicArray.isMonotonic(new int[]{3, 4, 2, 3}));
    }
}