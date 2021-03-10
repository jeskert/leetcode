package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsomorphicStringsTest {
    IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

    @Test
    public void test1() {
        assertTrue(isomorphicStrings.isIsomorphic("egg", "add"));
    }

    @Test
    public void test2() {
        assertFalse(isomorphicStrings.isIsomorphic("foo", "bar"));
    }

    @Test
    public void test3() {
        assertTrue(isomorphicStrings.isIsomorphic("paper", "title"));
    }

    @Test
    public void test4() {
        assertFalse(isomorphicStrings.isIsomorphic("badc", "baba"));
    }
}