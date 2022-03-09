package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FloodFillTest {
    FloodFill floodFill = new FloodFill();

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}}, floodFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2));
        assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 2}}, floodFill.floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}}, 0, 0, 2));

    }
}