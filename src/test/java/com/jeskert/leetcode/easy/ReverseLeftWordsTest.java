package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseLeftWordsTest {

    ReverseLeftWords reverseLeftWords = new ReverseLeftWords();

    @Test
    public void test1() {
        String s = "abcdefg";
        int k = 2;
        assertEquals("cdefgab", reverseLeftWords.reverseLeftWords(s, k));
    }

    @Test
    public void test2() {
        String s = "lrloseumgh";
        int k = 6;
        assertEquals("umghlrlose", reverseLeftWords.reverseLeftWords(s, k));
    }
}
