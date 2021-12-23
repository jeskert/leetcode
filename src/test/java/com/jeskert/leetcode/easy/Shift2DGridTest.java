package com.jeskert.leetcode.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Shift2DGridTest {
    Shift2DGrid shift2DGrid = new Shift2DGrid();

    @Test
    public void test1() {
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<List<Integer>> res = shift2DGrid.shiftGrid(grid, 1);
        List<Integer> list1 = Arrays.asList(9, 1, 2);
        List<Integer> list2 = Arrays.asList(3, 4, 5);
        List<Integer> list3 = Arrays.asList(6, 7, 8);
        assertTrue(res.contains(list1));
        assertTrue(res.contains(list2));
        assertTrue(res.contains(list3));
    }

    @Test
    public void test2() {
        int[][] grid = new int[][]{{1}, {2}, {3}, {4}, {7}, {6}, {5}};
        List<List<Integer>> res = shift2DGrid.shiftGrid(grid, 23);
        System.out.println(res);
    }
}