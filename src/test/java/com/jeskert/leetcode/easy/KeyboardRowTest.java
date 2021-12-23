package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class KeyboardRowTest {
    KeyboardRow keyboardRow = new KeyboardRow();

    @Test
    public void test1() {
        String[] results = keyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        assertArrayEquals(new String[]{"Alaska", "Dad"}, results);
    }

    @Test
    public void test2() {
        String[] results = keyboardRow.findWords(new String[]{"omk"});
        assertArrayEquals(new String[]{}, results);
    }

    @Test
    public void test3() {
        String[] results = keyboardRow.findWords(new String[]{"adsdf","sfd"});
        assertArrayEquals(new String[]{"adsdf","sfd"}, results);
    }
}