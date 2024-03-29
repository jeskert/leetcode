package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{3, 3}, 6));
    }
}