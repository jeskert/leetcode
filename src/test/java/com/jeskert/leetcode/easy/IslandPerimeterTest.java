package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class IslandPerimeterTest {
    IslandPerimeter islandPerimeter = new IslandPerimeter();

    @Test
    public void test1() {
        int[][] grid = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        assertEquals(16, islandPerimeter.islandPerimeter(grid));
    }


    @Test
    public void test2() {
        int[][] grid = new int[][]{{1}};
        assertEquals(4, islandPerimeter.islandPerimeter(grid));
    }

    @Test
    public void test3() {
        int[][] grid = new int[][]{{1, 0}};
        assertEquals(4, islandPerimeter.islandPerimeter(grid));
    }
}