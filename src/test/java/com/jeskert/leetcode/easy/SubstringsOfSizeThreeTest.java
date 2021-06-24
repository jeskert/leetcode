package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubstringsOfSizeThreeTest {
    SubstringsOfSizeThree substringsOfSizeThree = new SubstringsOfSizeThree();

    @Test
    public void test1() {
        assertEquals(1, substringsOfSizeThree.countGoodSubString("xyzzaz"));
        assertEquals(4, substringsOfSizeThree.countGoodSubString("aababcabc"));
    }
}
