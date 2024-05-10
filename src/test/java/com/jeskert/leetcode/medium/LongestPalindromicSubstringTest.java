package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    public void test1() {
        assertEquals("bab", longestPalindromicSubstring.longestPalindrome("babad"));
        assertEquals("bb", longestPalindromicSubstring.longestPalindrome("cbbd"));
    }
}