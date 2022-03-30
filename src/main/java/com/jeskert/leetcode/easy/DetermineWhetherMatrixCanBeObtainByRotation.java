package com.jeskert.leetcode.easy;

public class DetermineWhetherMatrixCanBeObtainByRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            mat = rotate(mat);
            if (equals(mat, target)) {
                return true;
            }
        }
        return false;
    }

    private int[][] rotate(int[][] mat) {
        int n = mat.length - 1;
        int[][] res = new int[n + 1][n + 1];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[j][n - i] = mat[i][j];
            }
        }
        return res;
    }

    private boolean equals(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
