package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumNumberOfBallsInABoxTest {
    MaximumNumberOfBallsInABox maximumNumberOfBallsInABox = new MaximumNumberOfBallsInABox();

    @Test
    public void test1() {
        assertEquals(2, maximumNumberOfBallsInABox.countBalls(1, 10));
    }

    @Test
    public void test2() {
        assertEquals(2, maximumNumberOfBallsInABox.countBalls(5, 15));
    }

    @Test
    public void test3() {
        assertEquals(2, maximumNumberOfBallsInABox.countBalls(19, 28));

    }
}