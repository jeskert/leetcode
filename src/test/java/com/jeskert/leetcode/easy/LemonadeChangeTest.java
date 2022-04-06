package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LemonadeChangeTest {
    LemonadeChange lemonadeChange = new LemonadeChange();

    @Test
    public void test1() {
        assertTrue(lemonadeChange.lemonadeChange(new int[]{5, 5, 5, 10, 20}));
        assertFalse(lemonadeChange.lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }
}