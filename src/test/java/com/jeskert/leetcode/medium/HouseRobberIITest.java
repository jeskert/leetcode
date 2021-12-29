package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberIITest {
    HouseRobberII houseRobber = new HouseRobberII();

    @Test
    public void test1() {
        assertEquals(3, houseRobber.rob(new int[]{2, 3, 2}));
        assertEquals(4, houseRobber.rob(new int[]{1, 2, 3, 1}));
        assertEquals(0, houseRobber.rob(new int[]{0}));
    }
}