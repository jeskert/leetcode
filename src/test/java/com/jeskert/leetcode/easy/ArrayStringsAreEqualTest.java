package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayStringsAreEqualTest {

    ArrayStringsAreEqual arrayStringsAreEqual = new ArrayStringsAreEqual();

    @Test
    public void test1() {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};
        assertTrue(arrayStringsAreEqual.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void test2() {
        String[] word1 = new String[]{"a", "cb"};
        String[] word2 = new String[]{"ab", "c"};
        assertFalse(arrayStringsAreEqual.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void test3() {
        String[] word1 = new String[]{"abc", "d", "defg"};
        String[] word2 = new String[]{"abcddefg"};
        assertTrue(arrayStringsAreEqual.arrayStringsAreEqual(word1, word2));
    }
}
