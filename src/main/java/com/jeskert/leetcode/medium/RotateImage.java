package com.jeskert.leetcode.medium;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        int[][] res = new int[n + 1][n + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res[j][n - i] = matrix[i][j];
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                matrix[i][j] = res[i][j];
            }
        }
    }
}
