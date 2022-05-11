package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindFirstAndLastPositionOfSortedArrayTest {
    FindFirstAndLastPositionOfSortedArray findFirstAndLastPositionOfSortedArray = new FindFirstAndLastPositionOfSortedArray();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{3, 4}, findFirstAndLastPositionOfSortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }
}