package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxAreaOfIslandTest {
    MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();

    @Test
    public void test1() {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        assertEquals(6, maxAreaOfIsland.maxAreaOfIsland(grid));
    }

    @Test
    public void test2() {
        int[][] grid = {{0, 0, 0, 0, 0, 0, 0, 0}};
        assertEquals(0, maxAreaOfIsland.maxAreaOfIsland(grid));
    }
}