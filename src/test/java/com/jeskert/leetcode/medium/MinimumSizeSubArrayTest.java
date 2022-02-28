package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSizeSubArrayTest {
    MinimumSizeSubarraySum minimumSizeSubArray = new MinimumSizeSubarraySum();

    @Test
    public void test1() {
        assertEquals(2, minimumSizeSubArray.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        assertEquals(1, minimumSizeSubArray.minSubArrayLen(4, new int[]{1, 4, 4}));
        assertEquals(0, minimumSizeSubArray.minSubArrayLen(4, new int[]{1, 1, 1, 1, 1, 1, 1}));
    }
}
