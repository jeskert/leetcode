package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheWidthOfColumnsOfAGridTest {
    FindTheWidthOfColumnsOfAGrid findTheWidthOfColumnsOfAGrid = new FindTheWidthOfColumnsOfAGrid();

    @Test
    public void test1() {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expected = {1, 1, 1};
        int[] actual = findTheWidthOfColumnsOfAGrid.findColumnWidth(grid);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[][] grid = {{1}};
        int[] expected = {1};
        int[] actual = findTheWidthOfColumnsOfAGrid.findColumnWidth(grid);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        int[][] grid = {{1}, {22}, {333}};
        int[] expected = {3};
        int[] actual = findTheWidthOfColumnsOfAGrid.findColumnWidth(grid);
        assertArrayEquals(expected, actual);
    }
}