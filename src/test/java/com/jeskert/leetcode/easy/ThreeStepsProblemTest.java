package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeStepsProblemTest {

    ThreeStepsProblem threeStepsProblem = new ThreeStepsProblem();

    @Test
    public void test1() {
        assertEquals(4, threeStepsProblem.waysToStep(3));
        assertEquals(13, threeStepsProblem.waysToStep(5));
        assertEquals(752119970, threeStepsProblem.waysToStep(61));
    }
}