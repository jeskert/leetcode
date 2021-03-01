package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeStringsAlternatelyTest {
    MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();

    @Test
    public void test1() {
        String word1 = "abc", word2 = "pqr";
        assertEquals("apbqcr", mergeStringsAlternately.mergeAlternately(word1, word2));
    }

    @Test
    public void test2() {
        String word1 = "ab", word2 = "pqrs";
        assertEquals("apbqrs", mergeStringsAlternately.mergeAlternately(word1, word2));
    }

    @Test
    public void test3() {
        String word1 = "abcd", word2 = "pq";
        assertEquals("apbqcd", mergeStringsAlternately.mergeAlternately(word1, word2));
    }
}
