package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SetMismatchTest {
    SetMismatch setMismatch = new SetMismatch();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 3}, setMismatch.findErrorNums(new int[]{1, 2, 2, 4}));
        assertArrayEquals(new int[]{1, 2}, setMismatch.findErrorNums(new int[]{1, 1}));
    }
}
