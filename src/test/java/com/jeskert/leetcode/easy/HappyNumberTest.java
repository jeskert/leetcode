package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {
    HappyNumber happyNumber = new HappyNumber();

    @Test
    public void test1() {
        assertTrue(happyNumber.isHappy(19));
        assertFalse(happyNumber.isHappy(2));
    }
}