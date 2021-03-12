package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LatestTimeByReplacingHiddenDigitsTest {
    LatestTimeByReplacingHiddenDigits latestTimeByReplacingHiddenDigits = new LatestTimeByReplacingHiddenDigits();

    @Test
    public void test1() {
        String time = "2?:?0";
        assertEquals("23:50", latestTimeByReplacingHiddenDigits.maximumTime(time));
    }

    @Test
    public void test2() {
        String time = "0?:3?";
        assertEquals("09:39", latestTimeByReplacingHiddenDigits.maximumTime(time));
    }

    @Test
    public void test3() {
        String time = "1?:22";
        assertEquals("19:22", latestTimeByReplacingHiddenDigits.maximumTime(time));
    }

    @Test
    public void test4() {
        String time = "?4:03";
        assertEquals("14:03", latestTimeByReplacingHiddenDigits.maximumTime(time));
    }

    @Test
    public void test5() {
        String time = "?5:13";
        assertEquals("15:13", latestTimeByReplacingHiddenDigits.maximumTime(time));
    }

    @Test
    public void test6() {
        String time = "??:3?";
        assertEquals("23:39", latestTimeByReplacingHiddenDigits.maximumTime(time));
    }

}