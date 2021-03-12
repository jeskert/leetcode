package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNearestPointHasSameCoordinateTest {
    FindNearestPointHasSameCoordinate findNearestPointHasSameCoordinate = new FindNearestPointHasSameCoordinate();

    @Test
    public void test1() {
        int x = 3;
        int y = 4;
        int[][] points = new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        assertEquals(2, findNearestPointHasSameCoordinate.nearestValidPoint(x, y, points));
    }

    @Test
    public void test2() {
        int x = 3;
        int y = 4;
        int[][] points = new int[][]{{3, 4}};
        assertEquals(0, findNearestPointHasSameCoordinate.nearestValidPoint(x, y, points));
    }

    @Test
    public void test3() {
        int x = 3;
        int y = 4;
        int[][] points = new int[][]{{2, 3}};
        assertEquals(-1, findNearestPointHasSameCoordinate.nearestValidPoint(x, y, points));
    }
}