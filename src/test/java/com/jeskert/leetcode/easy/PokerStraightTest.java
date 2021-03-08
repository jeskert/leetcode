package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PokerStraightTest {
    PokerStraight pokerStraight = new PokerStraight();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        assertTrue(pokerStraight.isStraight(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0, 0, 1, 2, 5};
        assertTrue(pokerStraight.isStraight(nums));
    }
}