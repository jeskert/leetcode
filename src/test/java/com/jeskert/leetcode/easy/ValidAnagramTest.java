package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {
    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void test1() {
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
        assertFalse(validAnagram.isAnagram("rat", "car"));
    }
}