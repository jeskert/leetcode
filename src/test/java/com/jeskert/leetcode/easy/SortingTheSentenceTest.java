package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTheSentenceTest {
    SortingTheSentence sortingTheSentence = new SortingTheSentence();

    @Test
    public void test1() {
        assertEquals("This is a sentence", sortingTheSentence.sortSentence("is2 sentence4 This1 a3"));
    }

    @Test
    public void test2() {
        assertEquals("Me Myself and I", sortingTheSentence.sortSentence("Myself2 Me1 I4 and3"));
    }

    @Test
    public void test3() {
        assertEquals("z z z", sortingTheSentence.sortSentence("z1 z2 z3"));
    }
}
