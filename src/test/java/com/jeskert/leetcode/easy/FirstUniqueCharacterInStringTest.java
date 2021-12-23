package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueCharacterInStringTest {
    FirstUniqueCharacterInString firstUniqueCharacterInString = new FirstUniqueCharacterInString();

    @Test
    public void test() {
        assertEquals(0, firstUniqueCharacterInString.firstUniqChar("leetcode"));
        assertEquals(2, firstUniqueCharacterInString.firstUniqChar("loveleetcode"));
    }
}