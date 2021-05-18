package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortArrayByIncreasingFrequencyTest {
    SortArrayByIncreasingFrequency sortArrayByIncreasingFrequency = new SortArrayByIncreasingFrequency();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 1, 2, 2, 2, 3};
        assertArrayEquals(new int[]{3, 1, 1, 2, 2, 2}, sortArrayByIncreasingFrequency.frequencySort(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{2, 3, 1, 3, 2};
        assertArrayEquals(new int[]{1, 3, 3, 2, 2}, sortArrayByIncreasingFrequency.frequencySort(nums));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1};
        assertArrayEquals(new int[]{5, -1, 4, 4, -6, -6, 1, 1, 1}, sortArrayByIncreasingFrequency.frequencySort(nums));

    }
}
