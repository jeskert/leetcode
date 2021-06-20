package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringIITest {
    ReverseStringII reverseStringII = new ReverseStringII();

    @Test
    public void test1() {
        assertEquals("bacdfeg", reverseStringII.reverseStr("abcdefg", 2));
    }
}
