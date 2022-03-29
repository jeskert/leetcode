package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreaterElementIIITest {
    NextGreaterElementIII nextGreaterElementIII = new NextGreaterElementIII();

    @Test
    public void test1() {
        assertEquals(21, nextGreaterElementIII.nextGreaterElement(12));
        assertEquals(-1, nextGreaterElementIII.nextGreaterElement(21));
    }
}