package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReshapeTheMatrixTest {
    ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();

    @Test
    public void test1() {
//        assertArrayEquals(new int[][]{{1, 2, 3, 4}}, reshapeTheMatrix.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4));
//        assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, reshapeTheMatrix.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 4));
//        assertArrayEquals(new int[][]{{1}, {2}, {3}, {4}}, reshapeTheMatrix.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 4, 1));
//        assertArrayEquals(new int[][]{{1, 2}}, reshapeTheMatrix.matrixReshape(new int[][]{{1, 2}}, 1, 1));
        assertArrayEquals(new int[][]{{1}, {2}, {3}, {4}}, reshapeTheMatrix.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 2));
    }
}