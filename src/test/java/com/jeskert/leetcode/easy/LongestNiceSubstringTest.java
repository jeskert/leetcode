package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestNiceSubstringTest {
    LongestNiceSubstring longestNiceSubstring = new LongestNiceSubstring();

    @Test
    public void test1() {
        assertEquals("aAa", longestNiceSubstring.longestNiceSubstring("YazaAay"));
    }

    @Test
    public void test2() {
        assertEquals("Bb", longestNiceSubstring.longestNiceSubstring("Bb"));
    }

    @Test
    public void test3() {
        assertEquals("", longestNiceSubstring.longestNiceSubstring("c"));
    }

    @Test
    public void test4() {
        assertEquals("dD", longestNiceSubstring.longestNiceSubstring("dDzeE"));
    }
}