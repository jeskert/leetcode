package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringToURLTest {
    StringToURL stringToURL = new StringToURL();

    @Test
    public void test1() {
        assertEquals("Mr%20John%20Smith", stringToURL.replaceSpaces("Mr John Smith    ", 13));
        assertEquals("%20%20%20%20%20", stringToURL.replaceSpaces("               ", 5));
    }
}
