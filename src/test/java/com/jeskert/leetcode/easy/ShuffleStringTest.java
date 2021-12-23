package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShuffleStringTest {
    ShuffleString shuffleString = new ShuffleString();

    @Test
    public void test1() {
        assertEquals("leetcode", shuffleString.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
        assertEquals("abc", shuffleString.restoreString("abc", new int[]{0, 1, 2}));
        assertEquals("nihao", shuffleString.restoreString("aiohn", new int[]{3, 1, 4, 2, 0}));
        assertEquals("arigatou", shuffleString.restoreString("aaiougrt", new int[]{4, 0, 2, 6, 7, 3, 1, 5}));
        assertEquals("rat", shuffleString.restoreString("art", new int[]{1,0,2}));
    }
}