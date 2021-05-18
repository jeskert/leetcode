package com.jeskert.leetcode.easy;

public class SpecialPositionsInABinaryMatrix {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int[] rows = new int[100];
        int[] cols = new int[100];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1 && rows[i] == 1 && cols[j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
