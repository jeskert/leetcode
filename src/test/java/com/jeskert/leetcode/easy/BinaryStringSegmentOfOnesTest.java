package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryStringSegmentOfOnesTest {
    BinaryStringSegmentOfOnes binaryStringSegmentOfOnes = new BinaryStringSegmentOfOnes();

    @Test
    public void test1() {
        assertFalse(binaryStringSegmentOfOnes.checkOnesSegment("1001"));
    }

    @Test
    public void test2() {
        assertTrue(binaryStringSegmentOfOnes.checkOnesSegment("110"));
    }
}