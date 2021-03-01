package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountTheNumberOfConsistentStringsTest {

    CountTheNumberOfConsistentStrings countTheNumberOfConsistentStrings = new CountTheNumberOfConsistentStrings();

    @Test
    public void test1() {
        String allowed = "ab";
        String[] words = new String[]{"ad", "bd", "aaab", "baa", "badab"};
        assertEquals(2, countTheNumberOfConsistentStrings.countConsistentStrings(allowed, words));
    }

    @Test
    public void test2() {
        String allowed = "abc";
        String[] words = new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"};
        assertEquals(7, countTheNumberOfConsistentStrings.countConsistentStrings(allowed, words));
    }

    @Test
    public void test3() {
        String allowed = "cad";
        String[] words = new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        assertEquals(4, countTheNumberOfConsistentStrings.countConsistentStrings(allowed, words));
    }
}
