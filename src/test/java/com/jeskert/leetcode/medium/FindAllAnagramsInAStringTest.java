package com.jeskert.leetcode.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FindAllAnagramsInAStringTest {
    FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();

    @Test
    public void test1() {
        List<Integer> res = findAllAnagramsInAString.findAnagrams("cbaebabacd", "abc");
        assertTrue(res.contains(0));
        assertTrue(res.contains(6));
    }

    @Test
    public void test2() {
        List<Integer> res = findAllAnagramsInAString.findAnagrams("abab", "ab");
        assertTrue(res.contains(0));
        assertTrue(res.contains(1));
        assertTrue(res.contains(2));
    }
}