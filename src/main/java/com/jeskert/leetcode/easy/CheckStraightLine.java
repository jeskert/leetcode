package com.jeskert.leetcode.easy;

public class CheckStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        int diffX = coordinates[1][0] - coordinates[0][0];
        int diffY = coordinates[1][1] - coordinates[0][1];
        for (int i = 1; i < coordinates.length - 1; i++) {
            int tempY = coordinates[i + 1][1] - coordinates[i][1];
            int tempX = coordinates[i + 1][0] - coordinates[i][0];
            if (diffY * tempX != tempY * diffX) {
                return false;
            }
        }
        return true;
    }
}
