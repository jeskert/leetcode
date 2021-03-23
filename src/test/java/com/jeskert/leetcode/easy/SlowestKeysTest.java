package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SlowestKeysTest {
    SlowestKeys slowestKeys = new SlowestKeys();

    @Test
    public void test1() {
        int[] releaseTimes = new int[]{9, 29, 49, 59};
        String keyPressed = "cbcd";
        assertEquals('c', slowestKeys.slowestKey(releaseTimes, keyPressed));
    }

    @Test
    public void test2() {
        int[] releaseTimes = new int[]{12, 23, 36, 46, 62};
        String keyPressed = "spuda";
        assertEquals('a', slowestKeys.slowestKey(releaseTimes, keyPressed));
    }
}