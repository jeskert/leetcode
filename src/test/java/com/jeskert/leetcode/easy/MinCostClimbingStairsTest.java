package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinCostClimbingStairsTest {
    MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();

    @Test
    public void test1() {
        assertEquals(15, minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, minCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}