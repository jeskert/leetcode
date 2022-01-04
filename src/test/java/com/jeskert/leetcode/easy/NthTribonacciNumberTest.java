package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthTribonacciNumberTest {
    NthTribonacciNumber nthTribonacciNumber = new NthTribonacciNumber();

    @Test
    public void test1() {
        assertEquals(4, nthTribonacciNumber.tribonacci(4));
        assertEquals(1389537, nthTribonacciNumber.tribonacci(25));
    }
}