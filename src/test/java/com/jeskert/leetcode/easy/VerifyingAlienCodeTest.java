package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class VerifyingAlienCodeTest {
    VerifyingAlienCode verifyingAlienCode = new VerifyingAlienCode();

    @Test
    public void test1() {
        String[] words = new String[]{"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        assertTrue(verifyingAlienCode.isAlienSorted(words, order));
    }

    @Test
    public void test2() {
        String[] words = new String[]{"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        assertFalse(verifyingAlienCode.isAlienSorted(words, order));
    }

    @Test
    public void test3() {
        String[] words = new String[]{"apple","app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertFalse(verifyingAlienCode.isAlienSorted(words, order));
    }

    @Test
    public void test4() {
        String[] words = new String[]{"kuvp","q"};
        String order = "ngxlkthsjuoqcpavbfdermiywz";
        assertTrue(verifyingAlienCode.isAlienSorted(words, order));
    }

    @Test
    public void test5() {
        String[] words = new String[]{"hello","hello"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertTrue(verifyingAlienCode.isAlienSorted(words, order));
    }
}