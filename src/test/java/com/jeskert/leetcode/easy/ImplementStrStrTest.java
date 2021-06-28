package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementStrStrTest {
    ImplementStrStr implementStrStr = new ImplementStrStr();

    @Test
    public void test1() {
        assertEquals(2, implementStrStr.strStr("hello", "ll"));
        assertEquals(-1, implementStrStr.strStr("aaaaa", "bba"));
        assertEquals(0, implementStrStr.strStr("", ""));
    }
}
