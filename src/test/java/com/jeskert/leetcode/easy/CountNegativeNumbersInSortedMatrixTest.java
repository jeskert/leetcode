package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountNegativeNumbersInSortedMatrixTest {
    CountNegativeNumbersInSortedMatrix countNegativeNumbersInSortedMatrix = new CountNegativeNumbersInSortedMatrix();

    @Test
    public void test1() {
        assertEquals(8, countNegativeNumbersInSortedMatrix.countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));
        assertEquals(0, countNegativeNumbersInSortedMatrix.countNegatives(new int[][]{{3, 2}, {1, 0}}));
    }
}