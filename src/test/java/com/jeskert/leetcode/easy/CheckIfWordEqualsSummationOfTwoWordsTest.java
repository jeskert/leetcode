package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfWordEqualsSummationOfTwoWordsTest {
    CheckIfWordEqualsSummationOfTwoWords checkIfWordEqualsSummationOfTwoWords = new CheckIfWordEqualsSummationOfTwoWords();

    @Test
    public void test1() {
        assertTrue(checkIfWordEqualsSummationOfTwoWords.isSumEqual("acb", "cba", "cdb"));
        assertFalse(checkIfWordEqualsSummationOfTwoWords.isSumEqual("aaa", "a", "aab"));
        assertTrue(checkIfWordEqualsSummationOfTwoWords.isSumEqual("aaa", "a", "aaaa"));
    }
}
