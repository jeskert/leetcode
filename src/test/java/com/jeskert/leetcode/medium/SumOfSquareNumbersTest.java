package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfSquareNumbersTest {
    SumOfSquareNumbers sumOfSquareNumbers = new SumOfSquareNumbers();

    @Test
    public void test1() {
//        assertTrue(sumOfSquareNumbers.judgeSquareSum(5));
//        assertFalse(sumOfSquareNumbers.judgeSquareSum(3));
//        assertTrue(sumOfSquareNumbers.judgeSquareSum(101));
//        assertTrue(sumOfSquareNumbers.judgeSquareSum(0));
//        assertTrue(sumOfSquareNumbers.judgeSquareSum(1));
//        assertTrue(sumOfSquareNumbers.judgeSquareSum(2));
//        assertTrue(sumOfSquareNumbers.judgeSquareSum(4));
        assertTrue(sumOfSquareNumbers.judgeSquareSum(2147483600));
    }
}