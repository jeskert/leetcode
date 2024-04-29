package com.jeskert.leetcode.easy;

public class FindTheWidthOfColumnsOfAGrid {
    public int[] findColumnWidth(int[][] grid) {
        int[] result = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            for (int[] ints : grid) {
                result[i] = Math.max(result[i], String.valueOf(ints[i]).length());
            }
        }
        return result;
    }
}
