package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumPathSumTest {

    MinimumPathSum minimumPathSum = new MinimumPathSum();

    @Test
    public void test1() {
        assertEquals(7, minimumPathSum.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        assertEquals(12, minimumPathSum.minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
}