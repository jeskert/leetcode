package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertToBase2Test {

    ConvertToBase2 convertToBase2 = new ConvertToBase2();

    @Test
    public void test1() {
        assertEquals("110", convertToBase2.baseNeg2(2));
        assertEquals("111", convertToBase2.baseNeg2(3));
        assertEquals("100", convertToBase2.baseNeg2(4));

    }
}