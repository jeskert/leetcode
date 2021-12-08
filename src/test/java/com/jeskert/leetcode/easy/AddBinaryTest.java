package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {
    AddBinary addBinary = new AddBinary();

    @Test
    public void test1() {
        assertEquals("100", addBinary.addBinary("11", "1"));
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
    }
}