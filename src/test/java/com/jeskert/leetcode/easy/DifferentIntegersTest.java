package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DifferentIntegersTest {
    DifferentIntegers differentIntegers = new DifferentIntegers();

    @Test
    public void test1() {
        assertEquals(3, differentIntegers.numDifferentIntegers("a123bc34d8ef34"));
        assertEquals(2, differentIntegers.numDifferentIntegers("leet1234code234"));
        assertEquals(1, differentIntegers.numDifferentIntegers("a1b01c001"));
    }
}