package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareOfASortedArrayTest {
    SquareOfASortedArray squareOfASortedArray = new SquareOfASortedArray();

    @Test
    public void test1() {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, squareOfASortedArray.sortedSquares(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{-7, -3, 2, 3, 11};
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, squareOfASortedArray.sortedSquares(nums));
    }
}
