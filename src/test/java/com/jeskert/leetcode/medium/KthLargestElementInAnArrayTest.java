package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestElementInAnArrayTest {
    KthLargestElementInAnArray kthLargestElementInAnArray = new KthLargestElementInAnArray();

    @Test
    public void test1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int expected = 5;
        int result = kthLargestElementInAnArray.findKthLargest(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int expected = 4;
        int result = kthLargestElementInAnArray.findKthLargest(nums, k);
        assertEquals(expected, result);
    }
}

