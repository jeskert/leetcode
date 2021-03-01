package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SmallNumberLessThanCurrentTest {
    SmallNumberLessThanCurrent smallNumberLessThanCurrent = new SmallNumberLessThanCurrent();

    @Test
    public void test1() {
        int[] nums = new int[]{8, 1, 2, 2, 3};
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, smallNumberLessThanCurrent.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{6, 5, 4, 8};
        assertArrayEquals(new int[]{2, 1, 0, 3}, smallNumberLessThanCurrent.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{7, 7, 7, 7};
        assertArrayEquals(new int[]{0, 0, 0, 0}, smallNumberLessThanCurrent.smallerNumbersThanCurrent(nums));
    }
}
