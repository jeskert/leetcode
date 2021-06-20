package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseVowelsOfStringTest {
    ReverseVowelsOfString reverseVowelsOfString = new ReverseVowelsOfString();

    @Test
    public void test1() {
        assertEquals("holle", reverseVowelsOfString.reverseVowels("hello"));
        assertEquals("leotcede", reverseVowelsOfString.reverseVowels("leetcode"));
        assertEquals("Aa", reverseVowelsOfString.reverseVowels("aA"));
        assertEquals("aA", reverseVowelsOfString.reverseVowels("Aa"));
    }
}
