package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void test1() {
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"}));
    }
}