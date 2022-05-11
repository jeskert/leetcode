package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDistanceBetweenValuesTest {
    MaximumDistanceBetweenValues maximumDistanceBetweenValues = new MaximumDistanceBetweenValues();

    @Test
    public void test1() {
        assertEquals(2, maximumDistanceBetweenValues.maxDistance(new int[]{55, 30, 5, 4, 2}, new int[]{100, 20, 10, 10, 5}));
    }
}