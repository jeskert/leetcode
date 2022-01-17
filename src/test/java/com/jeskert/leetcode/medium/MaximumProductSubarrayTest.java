package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumProductSubarrayTest {

    MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();
    @Test
    public void test1() {
        assertEquals(6, maximumProductSubarray.maxProduct(new int[]{2, 3, -2, 4}));
        assertEquals(0, maximumProductSubarray.maxProduct(new int[]{-2, 0, -1}));
        assertEquals(-2, maximumProductSubarray.maxProduct(new int[]{-2}));
    }
}