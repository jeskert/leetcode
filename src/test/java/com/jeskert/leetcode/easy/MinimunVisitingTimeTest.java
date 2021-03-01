package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimunVisitingTimeTest {

    MinimumVisitingTime minimumVisitingTime = new MinimumVisitingTime();

    @Test
    public void test1() {
        int[][] points = new int[][]{{1, 1}, {3, 4}, {-1, 0}};
        assertEquals(7, minimumVisitingTime.minTimeToVisitAllPoints(points));
    }

    @Test
    public void test2() {
        int[][] points = new int[][]{{3, 2}, {-2, 2}};
        assertEquals(5, minimumVisitingTime.minTimeToVisitAllPoints(points));
    }
}
