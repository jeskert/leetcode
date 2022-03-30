package com.jeskert.leetcode.medium;

import org.junit.Test;

import java.util.List;


public class SpiralMatrixTest {
    SpiralMatrix spiralMatrix = new SpiralMatrix();

    @Test
    public void test1() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> res = spiralMatrix.spiralOrder(matrix);
        System.out.println(res);
    }

    @Test
    public void test2() {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> res = spiralMatrix.spiralOrder(matrix);
        System.out.println(res);
    }
}