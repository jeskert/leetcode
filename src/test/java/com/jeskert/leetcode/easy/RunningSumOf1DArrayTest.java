package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RunningSumOf1DArrayTest {
    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 4};
        RunningSumOf1DArray runningSumOf1DArray = new RunningSumOf1DArray();
        assertArrayEquals(new int[]{1, 3, 6, 10}, runningSumOf1DArray.runningSum(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 1, 1, 1, 1};
        RunningSumOf1DArray runningSumOf1DArray = new RunningSumOf1DArray();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, runningSumOf1DArray.runningSum(nums));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{3, 1, 2, 10, 1};
        RunningSumOf1DArray runningSumOf1DArray = new RunningSumOf1DArray();
        int[] result = runningSumOf1DArray.runningSum(nums);
        assertArrayEquals(new int[]{3, 4, 6, 16, 17}, result);
    }

}
