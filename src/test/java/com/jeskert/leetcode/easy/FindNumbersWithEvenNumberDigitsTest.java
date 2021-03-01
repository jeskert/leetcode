package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindNumbersWithEvenNumberDigitsTest {

    FindNumbersWithEvenNumberDigits findNumbersWithEvenNumberDigits = new FindNumbersWithEvenNumberDigits();

    @Test
    public void test1() {
        int[] nums = new int[]{12, 345, 2, 6, 7896};
        assertEquals(2, findNumbersWithEvenNumberDigits.findNumbers(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{555, 901, 482, 1771};
        assertEquals(1, findNumbersWithEvenNumberDigits.findNumbers(nums));
    }

}
