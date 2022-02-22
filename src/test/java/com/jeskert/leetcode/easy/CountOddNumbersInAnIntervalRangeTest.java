package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountOddNumbersInAnIntervalRangeTest {
    CountOddNumbersInAnIntervalRange countOddNumbersInAnIntervalRange = new CountOddNumbersInAnIntervalRange();

    @Test
    public void test1() {
        assertEquals(3, countOddNumbersInAnIntervalRange.countOdds(3, 7));
        assertEquals(1, countOddNumbersInAnIntervalRange.countOdds(8, 10));
        assertEquals(3, countOddNumbersInAnIntervalRange.countOdds(3, 8));
        assertEquals(4, countOddNumbersInAnIntervalRange.countOdds(8, 16));
    }
}