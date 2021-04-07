package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfEvenNumbersAfterQueryTest {
    SumOfEvenNumbersAfterQuery sumOfEvenNumbersAfterQuery = new SumOfEvenNumbersAfterQuery();

    @Test
    public void test1() {
        int[] A = new int[]{1, 2, 3, 4};
        int[][] queries = new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        assertArrayEquals(new int[]{8, 6, 2, 4}, sumOfEvenNumbersAfterQuery.sumEvenAfterQueries(A, queries));
    }
}