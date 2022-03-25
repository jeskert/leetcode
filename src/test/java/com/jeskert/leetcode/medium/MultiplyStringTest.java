package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyStringTest {
    MultiplyString multiplyString = new MultiplyString();

    @Test
    public void test1() {
        assertEquals("6", multiplyString.multiply("2", "3"));
        assertEquals("56088", multiplyString.multiply("123", "456"));
    }
}