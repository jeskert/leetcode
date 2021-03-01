package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixDiagonalSumTest {
    MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();

    @Test
    public void test1() {
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(25, matrixDiagonalSum.diagonalSum(mat));
    }

    @Test
    public void test2() {
        int[][] mat = new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        assertEquals(8, matrixDiagonalSum.diagonalSum(mat));
    }

    @Test
    public void test3() {
        int[][] mat = new int[][]{{5}};
        assertEquals(5, matrixDiagonalSum.diagonalSum(mat));
    }
}
