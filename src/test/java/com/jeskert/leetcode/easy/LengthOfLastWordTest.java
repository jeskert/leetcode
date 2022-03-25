package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {
    LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    public void test1() {
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
        assertEquals(4, lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon"));
        assertEquals(6, lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
    }
}