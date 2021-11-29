package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssignCookiesTest {
    AssignCookies assignCookies = new AssignCookies();

    @Test
    public void test1() {
        assertEquals(1, assignCookies.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        assertEquals(2, assignCookies.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
        assertEquals(1, assignCookies.findContentChildren(new int[]{1, 2, 3}, new int[]{3}));
    }
}