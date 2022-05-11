package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchA2dMatrixTest {
    SearchA2dMatrix searchA2dMatrix = new SearchA2dMatrix();

    @Test
    public void test1() {
        assertTrue(searchA2dMatrix.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
        assertFalse(searchA2dMatrix.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));
    }
}