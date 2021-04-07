package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RepeatedSubstringPatternTest {
    RepeatedSubstringPattern repeatedSubstringPattern = new RepeatedSubstringPattern();

    @Test
    public void test2() {
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("aba"));
    }

    @Test
    public void test1() {
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern("abab"));
    }

    @Test
    public void test3() {
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern("abcabcabcabc"));
    }

    @Test
    public void test4() {
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("aabaaba"));
    }
}