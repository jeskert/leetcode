package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NonDecreasingArrayTest {
    NonDecreasingArray nonDecreasingArray = new NonDecreasingArray();

    @Test
    public void test1() {
        int[] nums = new int[]{4, 2, 3};
        assertTrue(nonDecreasingArray.checkPossibility(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{4, 2, 1};
        assertFalse(nonDecreasingArray.checkPossibility(nums));
    }

}
