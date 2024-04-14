package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortAnArrayTest {
    SortAnArray sortAnArray = new SortAnArray();
    @Test
    public void test1() {
        int[] nums = new int[]{5, 2, 3, 1};
        assertArrayEquals(new int[]{1, 2, 3, 5}, sortAnArray.sortArray(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{-1, 5, 3, 4, 0};
        assertArrayEquals(new int[]{-1, 0, 3, 4, 5}, sortAnArray.sortArray(nums));
    }
}