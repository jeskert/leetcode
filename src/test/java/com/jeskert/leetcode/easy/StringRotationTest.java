package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRotationTest {
    StringRotation stringRotation = new StringRotation();

    @Test
    public void test1() {
        assertTrue(stringRotation.isFlipedString("waterbottle", "erbottlewat"));
    }

    @Test
    public void test2() {
        assertFalse(stringRotation.isFlipedString("aa", "aba"));
    }
}
