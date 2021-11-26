package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class RansomNoteTest {
    RansomNote ransomNote = new RansomNote();

    @Test
    public void test1() {
        assertFalse(ransomNote.canConstruct("a", "b"));
        assertFalse(ransomNote.canConstruct("aa", "ab"));
        assertTrue(ransomNote.canConstruct("aa", "aab"));
    }
}