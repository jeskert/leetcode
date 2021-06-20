package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseStringTest {
    ReverseString reverseString = new ReverseString();

    @Test
    public void test1() {
        String s = "hello";
        char[] chars = s.toCharArray();
        reverseString.reverseString(chars);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, chars);
    }

    @Test
    public void test2() {
        String s = "Hannah";
        char[] chars = s.toCharArray();
        reverseString.reverseString(chars);
        assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, chars);
    }
}
