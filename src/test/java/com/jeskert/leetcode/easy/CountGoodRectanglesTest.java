package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountGoodRectanglesTest {

    CountGoodRectangles countGoodRectangles = new CountGoodRectangles();

    @Test
    public void test1() {
        int[][] rectangles = new int[][]{{5, 8}, {3, 9}, {5, 12}, {16, 5}};
        assertEquals(3, countGoodRectangles.countGoodRectangles(rectangles));
    }

    @Test
    public void test2() {
        int[][] rectangles = new int[][]{{2, 3}, {3, 7}, {4, 3}, {3, 7}};
        assertEquals(3, countGoodRectangles.countGoodRectangles(rectangles));
    }
}