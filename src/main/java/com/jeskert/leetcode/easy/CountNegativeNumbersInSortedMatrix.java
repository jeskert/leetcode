package com.jeskert.leetcode.easy;

public class CountNegativeNumbersInSortedMatrix {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cnt = 0;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (grid[i][j] < 0) {
                cnt += m - i;
                j--;
            } else {
                i++;
            }
        }
        return cnt;
    }
}
