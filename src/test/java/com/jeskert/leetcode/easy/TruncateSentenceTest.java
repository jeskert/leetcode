package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TruncateSentenceTest {
    TruncateSentence truncateSentence = new TruncateSentence();

    @Test
    public void test1() {
        assertEquals("Hello how are you", truncateSentence.truncateSentence("Hello how are you Contestant", 4));
        assertEquals("What is the solution", truncateSentence.truncateSentence("What is the solution to this problem", 4));
        assertEquals("chopper is not a tanuki", truncateSentence.truncateSentence("chopper is not a tanuki", 5));
    }
}