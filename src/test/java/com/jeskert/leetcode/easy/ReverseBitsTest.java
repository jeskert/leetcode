package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseBitsTest {
    ReverseBits reverseBits = new ReverseBits();

    @Test
    public void test1() {
        assertEquals(964176192, reverseBits.reverseBits(43261596));
    }
}