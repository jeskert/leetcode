package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RelativeRanksTest {
    RelativeRanks relativeRanks = new RelativeRanks();

    @Test
    public void test1() {
        assertArrayEquals(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}, relativeRanks.findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
    }
}
