package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 1, 2};
        assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(nums));
    }
}