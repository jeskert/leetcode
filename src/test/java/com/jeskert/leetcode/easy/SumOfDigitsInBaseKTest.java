package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfDigitsInBaseKTest {
    SumOfDigitsInBaseK sumOfDigitsInBaseK = new SumOfDigitsInBaseK();

    @Test
    public void test1() {
        assertEquals(9, sumOfDigitsInBaseK.sumBase(34, 6));
        assertEquals(1, sumOfDigitsInBaseK.sumBase(10, 10));
    }
}