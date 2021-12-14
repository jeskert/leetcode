package com.jeskert.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        List<Integer> flat = new ArrayList<>();
        for (int[] row : grid) {
            for (int num : row) {
                flat.add(num);
            }
        }
        int[] flatArray = flat.stream().mapToInt(Integer::intValue).toArray();
        int[][] res = new int[m][n];
        for (int i = 0; i < flatArray.length; i++) {
            int index = i + k;
            int x = (index / n) % m;
            int y = index % n;
            res[x][y] = flatArray[i];
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(res[i][j]);
            }
            result.add(row);
        }
        return result;
    }
}
