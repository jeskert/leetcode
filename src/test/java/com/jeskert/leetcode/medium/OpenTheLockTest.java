package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class OpenTheLockTest {
    OpenTheLock openTheLock = new OpenTheLock();

    @Test
    public void test1() {
        assertEquals(6, openTheLock.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"));
        assertEquals(1, openTheLock.openLock(new String[]{"8888"}, "0009"));
        assertEquals(-1, openTheLock.openLock(new String[]{"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"}, "8888"));
    }
}