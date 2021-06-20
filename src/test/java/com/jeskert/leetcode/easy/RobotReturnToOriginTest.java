package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobotReturnToOriginTest {
    RobotReturnToOrigin robotReturnToOrigin = new RobotReturnToOrigin();

    @Test
    public void test1() {
        assertTrue(robotReturnToOrigin.judgeCircle("UD"));
        assertFalse(robotReturnToOrigin.judgeCircle("LL"));
    }
}
