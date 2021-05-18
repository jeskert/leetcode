package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecialPositionsInABinaryMatrixTest {
    SpecialPositionsInABinaryMatrix specialPositionsInABinaryMatrix = new SpecialPositionsInABinaryMatrix();

    @Test
    public void test1() {
        int[][] mat = new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}};
        assertEquals(1, specialPositionsInABinaryMatrix.numSpecial(mat));
    }

    @Test
    public void test2() {
        int[][] mat = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        assertEquals(3, specialPositionsInABinaryMatrix.numSpecial(mat));
    }

    @Test
    public void test3() {
        int[][] mat = new int[][]{{0, 0, 0, 1}, {1, 0, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        assertEquals(2, specialPositionsInABinaryMatrix.numSpecial(mat));
    }

    @Test
    public void test4() {
        int[][] mat = new int[][]{{0, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 1}};
        assertEquals(3, specialPositionsInABinaryMatrix.numSpecial(mat));
    }
}
