package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMinimumInRotatedSortedArrayTest {
    FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();

    @Test
    public void test1() {
        assertEquals(1, findMinimumInRotatedSortedArray.findMin(new int[]{3, 4, 5, 1, 2}));
        assertEquals(0, findMinimumInRotatedSortedArray.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        assertEquals(11, findMinimumInRotatedSortedArray.findMin(new int[]{11, 13, 15, 17}));
    }
}