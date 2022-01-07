package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePathIITest {
    UniquePathII uniquePathII = new UniquePathII();

    @Test
    public void test1() {
        int[][] obstacleGrid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        assertEquals(2, uniquePathII.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    public void test2() {
        int[][] obstacleGrid = new int[][]{{0, 1}, {0, 0}};
        assertEquals(1, uniquePathII.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    public void test3() {
        int[][] obstacleGrid = new int[][]{{0, 0}, {0, 1}};
        assertEquals(0, uniquePathII.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    public void test4() {
        int[][] obstacleGrid = new int[][]{{0, 0}, {1, 1}, {0, 0}};
        assertEquals(0, uniquePathII.uniquePathsWithObstacles(obstacleGrid));
    }

}