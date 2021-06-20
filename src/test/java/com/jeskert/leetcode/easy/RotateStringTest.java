package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateStringTest {
    RotateString rotateString = new RotateString();

    @Test
    public void test1() {
        assertTrue(rotateString.rotateString("abcde", "cdeab"));
        assertFalse(rotateString.rotateString("abcde", "abced"));
        assertTrue(rotateString.rotateString("", ""));
    }
}
