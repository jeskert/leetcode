package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MostCommonWordsTest {
    MostCommonWords mostCommonWords = new MostCommonWords();

    @Test
    public void test1() {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[]{"hit"};
        assertEquals("ball", mostCommonWords.mostCommonWord(paragraph, banned));
    }

    @Test
    public void test2() {
        String paragraph = "Bob. hIt, baLl";
        String[] banned = new String[]{"bob", "hit"};
        assertEquals("ball", mostCommonWords.mostCommonWord(paragraph, banned));
    }

    @Test
    public void test3() {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = new String[]{"a"};
        assertEquals("b", mostCommonWords.mostCommonWord(paragraph, banned));
    }
}
