package com.jeskert.leetcode.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LetterCasePermutationsTest {
    LetterCasePermutations letterCasePermutations = new LetterCasePermutations();

    @Test
    public void test1() {
        assertEquals(List.of("a1b2", "a1B2", "A1b2", "A1B2"), letterCasePermutations.letterCasePermutation("a1b2"));
        assertEquals(List.of("3z4","3Z4"), letterCasePermutations.letterCasePermutation("3z4"));
    }
}