package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsTest {

    NumberOfIslands numberOfIslands = new NumberOfIslands();
    @Test
    public void test1() {
        // given
        char[][] grid = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        // when
        int result = numberOfIslands.numIslands(grid);
        // then
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        // given
        char[][] grid = new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        // when
        int result = numberOfIslands.numIslands(grid);
        // then
        assertEquals(3, result);
    }
}