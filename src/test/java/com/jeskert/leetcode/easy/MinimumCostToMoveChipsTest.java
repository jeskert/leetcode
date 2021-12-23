package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumCostToMoveChipsTest {
    MinimumCostToMoveChips minimumCostToMoveChips = new MinimumCostToMoveChips();

    @Test
    public void test1() {
        assertEquals(1, minimumCostToMoveChips.minCostToMoveChips(new int[]{1, 2, 3}));
        assertEquals(2, minimumCostToMoveChips.minCostToMoveChips(new int[]{2, 2, 2, 3, 3}));
    }
}