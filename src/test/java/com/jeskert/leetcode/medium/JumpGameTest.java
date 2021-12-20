package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameTest {
    JumpGame jumpGame = new JumpGame();

    @Test
    public void test1() {
        assertTrue(jumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(jumpGame.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}