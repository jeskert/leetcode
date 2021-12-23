package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestTriangleAreaTest {
    LargestTriangleArea largestTriangleArea = new LargestTriangleArea();

    @Test
    public void test() {
        int[][] points = new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
        assertEquals(2.0d, largestTriangleArea.largestTriangleArea(points), 6);
    }
}