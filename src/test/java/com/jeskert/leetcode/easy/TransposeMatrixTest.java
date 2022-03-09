package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TransposeMatrixTest {

    @Test
    public void test1() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        int[][] transposed = transposeMatrix.transpose(matrix);
        assertArrayEquals(transposed, new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}});
    }

    @Test
    public void test2() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}};
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        int[][] transposed = transposeMatrix.transpose(matrix);
        assertArrayEquals(transposed, new int[][]{{1, 4}, {2, 5}, {3, 6}});
    }
}
