package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberTest {
    HouseRobber houseRobber = new HouseRobber();

    @Test
    public void test1() {
        assertEquals(4, houseRobber.rob(new int[]{1, 2, 3, 1}));
        assertEquals(12, houseRobber.rob(new int[]{2, 7, 9, 3, 1}));
    }
}