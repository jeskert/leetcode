package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeastMinuteTest {
    LeastMinute leastMinute = new LeastMinute();

    @Test
    public void test1() {
        assertEquals(2, leastMinute.leastMinutes(2));
        assertEquals(3, leastMinute.leastMinutes(4));
    }

}