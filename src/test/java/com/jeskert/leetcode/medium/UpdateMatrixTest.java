package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpdateMatrixTest {
    UpdateMatrix updateMatrix = new UpdateMatrix();

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}, updateMatrix.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}}, updateMatrix.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}}));
    }
}