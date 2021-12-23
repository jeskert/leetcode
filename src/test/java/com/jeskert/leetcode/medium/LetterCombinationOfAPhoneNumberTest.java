package com.jeskert.leetcode.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinationOfAPhoneNumberTest {
    LetterCombinationOfAPhoneNumber letterCombinationOfAPhoneNumber = new LetterCombinationOfAPhoneNumber();

    @Test
    public void test1() {
        String digits = "23";
        List<String> res = letterCombinationOfAPhoneNumber.letterCombinations(digits);
        assertTrue(res.contains("ad"));
        assertTrue(res.contains("ae"));
        assertTrue(res.contains("af"));
        assertTrue(res.contains("bf"));
        assertTrue(res.contains("bd"));
        assertTrue(res.contains("be"));
        assertTrue(res.contains("cd"));
        assertTrue(res.contains("ce"));
        assertTrue(res.contains("cf"));
    }

    @Test
    public void test2() {
        List<String> res = letterCombinationOfAPhoneNumber.letterCombinations("");
        assertEquals(0, res.size());
    }

    @Test
    public void test3() {
        List<String> res = letterCombinationOfAPhoneNumber.letterCombinations("2");
        assertTrue(res.contains("a"));
        assertTrue(res.contains("b"));
        assertTrue(res.contains("c"));
    }
}