package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllDigitsWithCharacterTest {
    ReplaceAllDigitsWithCharacter replaceAllDigitsWithCharacter = new ReplaceAllDigitsWithCharacter();

    @Test
    public void test1() {
        assertEquals("abcdef", replaceAllDigitsWithCharacter.replaceDigits("a1c1e1"));
        assertEquals("abbdcfdhe", replaceAllDigitsWithCharacter.replaceDigits("a1b2c3d4e"));
    }
}