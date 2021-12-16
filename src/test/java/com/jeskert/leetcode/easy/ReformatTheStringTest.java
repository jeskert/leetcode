package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReformatTheStringTest {
    ReformatTheString reformatTheString = new ReformatTheString();

    @Test
    public void test1() {
        assertEquals("0a1b2c", reformatTheString.reformat("a0b1c2"));
        assertEquals("", reformatTheString.reformat("leetcode"));
        assertEquals("", reformatTheString.reformat("1229857369"));
        assertEquals("c2o0v1i9d", reformatTheString.reformat("covid2019"));
        assertEquals("1a2b3", reformatTheString.reformat("ab123"));
    }
}