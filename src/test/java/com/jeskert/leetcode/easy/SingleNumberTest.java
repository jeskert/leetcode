package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {
    SingleNumber singleNumber = new SingleNumber();

    @Test
    public void test1() {
        assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}));
        assertEquals(4, singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}