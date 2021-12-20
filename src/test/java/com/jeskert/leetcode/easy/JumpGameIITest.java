package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameIITest {
    JumpGameII jumpGameII = new JumpGameII();

    @Test
    public void test1() {
        assertEquals(2, jumpGameII.jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(2, jumpGameII.jump(new int[]{2, 3, 0, 1, 4}));
    }
}