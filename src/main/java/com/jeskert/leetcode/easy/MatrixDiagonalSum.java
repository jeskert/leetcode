package com.jeskert.leetcode.easy;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int length = mat.length;
        for (int i = 0; i < length; i++) {
            primaryDiagonalSum += mat[i][i];
            secondaryDiagonalSum += mat[i][length - i - 1];
        }
        if (length % 2 != 0) {
            secondaryDiagonalSum -= mat[(length - 1) / 2][(length - 1) / 2];
        }
        return primaryDiagonalSum + secondaryDiagonalSum;
    }
}
