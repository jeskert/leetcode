package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractProductAndSumTest {

    SubtractProductAndSum subtractProductAndSum = new SubtractProductAndSum();

    @Test
    public void test1() {
        int n = 234;
        assertEquals(15, subtractProductAndSum.subtractProductAndSum(n));
    }

    @Test
    public void test2() {
        int n = 4421;
        assertEquals(21, subtractProductAndSum.subtractProductAndSum(n));
    }
}
