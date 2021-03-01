package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfGoodPairsTest {

    NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 1, 1, 3};
        assertEquals(4, numberOfGoodPairs.numIdenticalPairs(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 1, 1, 1};
        assertEquals(6, numberOfGoodPairs.numIdenticalPairs(nums));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 2, 3};
        assertEquals(0, numberOfGoodPairs.numIdenticalPairs(nums));
    }
}
