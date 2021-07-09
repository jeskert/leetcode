package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {
    ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    public void test1() {
        assertEquals(2, climbingStairs.climbStairs(2));
        assertEquals(3, climbingStairs.climbStairs(3));
    }
}
