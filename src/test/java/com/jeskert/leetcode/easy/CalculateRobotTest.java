package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateRobotTest {
    CalculateRobot calculateRobot = new CalculateRobot();

    @Test
    public void test1() {
        String s = "AB";
        assertEquals(4, calculateRobot.calculate(s));
    }
}
