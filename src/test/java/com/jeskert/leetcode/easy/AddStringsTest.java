package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddStringsTest {
    AddStrings addStrings = new AddStrings();

    @Test
    public void test1() {
        assertEquals("134", addStrings.addStrings("11", "123"));
        assertEquals("533", addStrings.addStrings("456", "77"));
        assertEquals("0", addStrings.addStrings("0", "0"));
    }
}