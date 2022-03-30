package com.jeskert.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    List<Integer> res;
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int topBorder;
    int rightBorder;
    int leftBorder;
    int bottomBorder;
    int i;
    int j;
    int[][] matrix;
    int dirIndex;
    public List<Integer> spiralOrder(int[][] matrix) {
        init(matrix);
        while (res.size() < matrix.length * matrix[0].length) {
            if (meetBorder()) {
                turn();
            }
            add();
            move();
        }
        return res;
    }

    private void init(int[][] matrix) {
        res = new ArrayList<>();
        topBorder = 0;
        rightBorder = matrix[0].length - 1;
        leftBorder = 0;
        bottomBorder = matrix.length - 1;
        i = 0;
        j = 0;
        this.matrix = matrix;
        dirIndex = 0;
    }

    private void move() {
        i += dirs[dirIndex][0];
        j += dirs[dirIndex][1];
    }

    private void add() {
        res.add(matrix[i][j]);
    }

    private void turn() {
        if (dirIndex == 0) {
            topBorder++;
        } else if (dirIndex == 1) {
            rightBorder--;
        } else if (dirIndex == 2) {
            bottomBorder--;
        } else {
            leftBorder++;
        }
        dirIndex = (dirIndex + 1) % 4;
    }

    private boolean meetBorder() {
        boolean isRightBorder = j == rightBorder && dirIndex == 0;
        boolean isBottomBorder = i == bottomBorder && dirIndex == 1;
        boolean isLeftBorder = j == leftBorder && dirIndex == 2;
        boolean isTopBorder = i == topBorder && dirIndex == 3;
        return isBottomBorder || isRightBorder || isLeftBorder || isTopBorder;
    }
}
