package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestSightseeingPairTest {
    BestSightseeingPair bestSightseeingPair = new BestSightseeingPair();

    @Test
    public void test1() {
        assertEquals(11, bestSightseeingPair.maxScoreSightseeingPair(new int[]{8, 1, 5, 2, 6}));
        assertEquals(2, bestSightseeingPair.maxScoreSightseeingPair(new int[]{1, 2}));
    }
}