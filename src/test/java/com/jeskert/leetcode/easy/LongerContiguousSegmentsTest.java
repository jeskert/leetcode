package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongerContiguousSegmentsTest {
    LongerContiguousSegments longerContiguousSegments = new LongerContiguousSegments();

    @Test
    public void test1() {
        assertTrue(longerContiguousSegments.checkZeroOnes("1101"));
        assertFalse(longerContiguousSegments.checkZeroOnes("111000"));
        assertFalse(longerContiguousSegments.checkZeroOnes("110100010"));
        assertTrue(longerContiguousSegments.checkZeroOnes("01111110"));
    }
}
