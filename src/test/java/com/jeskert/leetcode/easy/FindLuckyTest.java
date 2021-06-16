package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindLuckyTest {
    FindLucky findLucky = new FindLucky();

    @Test
    public void test1() {
        assertEquals(2, findLucky.findLucky(new int[]{2, 2, 3, 4}));
        assertEquals(3, findLucky.findLucky(new int[]{1, 2, 2, 3, 3, 3}));
        assertEquals(-1, findLucky.findLucky(new int[]{2, 2, 2, 3, 3}));
        assertEquals(-1, findLucky.findLucky(new int[]{5}));
        assertEquals(7, findLucky.findLucky(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }
}
