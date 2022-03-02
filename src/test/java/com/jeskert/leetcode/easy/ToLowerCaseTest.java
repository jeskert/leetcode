package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToLowerCaseTest {
    ToLowerCase toLowerCase = new ToLowerCase();

    @Test
    public void test() {
        assertEquals("hello", toLowerCase.toLowerCase("Hello"));
        assertEquals("here", toLowerCase.toLowerCase("here"));
        assertEquals("lovely", toLowerCase.toLowerCase("LOVELY"));
    }
}