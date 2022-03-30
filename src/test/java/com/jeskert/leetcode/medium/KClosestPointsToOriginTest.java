package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class KClosestPointsToOriginTest {
    KClosestPointsToOrigin kClosestPointsToOrigin = new KClosestPointsToOrigin();

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{-2, 2}}, kClosestPointsToOrigin.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[][]{{3, 3}, {-2, 4}}, kClosestPointsToOrigin.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));
    }
}