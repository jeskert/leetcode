package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumDistanceToTheTargetElementTest {
    MinimumDistanceToTheTargetElement minimumDistanceToTheTargetElement = new MinimumDistanceToTheTargetElement();

    @Test
    public void test1() {
        assertEquals(1, minimumDistanceToTheTargetElement.getMinDistance(new int[]{1, 2, 3, 4, 5}, 5, 3));
        assertEquals(0, minimumDistanceToTheTargetElement.getMinDistance(new int[]{1}, 1, 0));
        assertEquals(0, minimumDistanceToTheTargetElement.getMinDistance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1, 0));
    }
}