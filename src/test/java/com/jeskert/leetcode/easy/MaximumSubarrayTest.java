package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {
    MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    public void test1() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1};
        assertEquals(1, maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{0};
        assertEquals(0, maximumSubarray.maxSubArray(nums));
    }


    @Test
    public void test4() {
        int[] nums = new int[]{-1};
        assertEquals(-1, maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void test5() {
        int[] nums = new int[]{-100000};
        assertEquals(-100000, maximumSubarray.maxSubArray(nums));
    }
}