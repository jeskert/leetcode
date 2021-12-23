package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheDifferenceTest {
    FindTheDifference findTheDifference = new FindTheDifference();

    @Test
    public void test1() {
        assertEquals('e', findTheDifference.findTheDifference("abcd", "abcde"));
        assertEquals('y', findTheDifference.findTheDifference("", "y"));
        assertEquals('a', findTheDifference.findTheDifference("a", "aa"));
        assertEquals('a', findTheDifference.findTheDifference("ae", "aea"));
    }
}