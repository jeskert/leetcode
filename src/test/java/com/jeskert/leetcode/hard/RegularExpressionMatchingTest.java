package com.jeskert.leetcode.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionMatchingTest {

    RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();

    @Test
    public void test1() {
        assertFalse(regularExpressionMatching.isMatch("aa", "a"));
        assertTrue(regularExpressionMatching.isMatch("aa", "a*"));
        assertTrue(regularExpressionMatching.isMatch("ab", ".*"));
        assertTrue(regularExpressionMatching.isMatch("aab", "c*a*b"));
        assertFalse(regularExpressionMatching.isMatch("mississippi", "mis*is*p*."));
    }
}