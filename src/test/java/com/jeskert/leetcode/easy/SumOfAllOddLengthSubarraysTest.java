package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfAllOddLengthSubarraysTest {
    SumOfAllOddLengthSubarrays sumOfAllOddLengthSubarrays = new SumOfAllOddLengthSubarrays();

    @Test
    public void test1() {
        int[] arr = new int[]{1, 4, 2, 5, 3};
        assertEquals(58, sumOfAllOddLengthSubarrays.sumOddLengthSubarrays(arr));
    }

    @Test
    public void test2() {
        int[] arr = new int[]{1, 2};
        assertEquals(3, sumOfAllOddLengthSubarrays.sumOddLengthSubarrays(arr));
    }

    @Test
    public void test3() {
        int[] arr = new int[]{10, 11, 12};
        assertEquals(66, sumOfAllOddLengthSubarrays.sumOddLengthSubarrays(arr));
    }
}
