package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class KWeakestRowsInMatrixTest {
    KWeakestRowsInMatrix kWeakestRowsInMatrix = new KWeakestRowsInMatrix();

    @Test
    public void test1() {
        int[][] mat =
                {{1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1}};
        assertArrayEquals(new int[]{2, 0, 3}, kWeakestRowsInMatrix.kWeakestRows(mat, 3));
    }
}