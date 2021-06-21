package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestOddNumberInStringTest {
    LargestOddNumberInString largestOddNumberInString = new LargestOddNumberInString();

    @Test
    public void test1() {
        assertEquals("5", largestOddNumberInString.largestOddNumber("52"));
        assertEquals("", largestOddNumberInString.largestOddNumber("4286"));
        assertEquals("35427", largestOddNumberInString.largestOddNumber("35427"));
    }
}
