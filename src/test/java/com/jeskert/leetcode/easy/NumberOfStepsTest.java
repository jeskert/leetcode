package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfStepsTest {

    NumberOfSteps numberOfSteps = new NumberOfSteps();

    @Test
    public void test1() {
        assertEquals(6, numberOfSteps.numberOfSteps(14));
    }

    @Test
    public void test2() {
        assertEquals(4, numberOfSteps.numberOfSteps(8));
    }


    @Test
    public void test3() {
        assertEquals(12, numberOfSteps.numberOfSteps(123));
    }
}
