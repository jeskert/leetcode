package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfSegmentsTest {
    NumberOfSegments numberOfSegments = new NumberOfSegments();

    @Test
    public void test1() {
        assertEquals(5, numberOfSegments.countSegments("Hello, my name is John"));
        assertEquals(0, numberOfSegments.countSegments("         "));
    }
}