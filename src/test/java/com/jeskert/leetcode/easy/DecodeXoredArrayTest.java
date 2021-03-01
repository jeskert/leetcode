package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DecodeXoredArrayTest {

    DecodeXoredArray decodeXoredArray = new DecodeXoredArray();

    @Test
    public void test1() {
        int[] encoded = new int[]{1, 2, 3};
        int first = 1;
        assertArrayEquals(new int[]{1, 0, 2, 1}, decodeXoredArray.decode(encoded, first));
    }

    @Test
    public void test2() {
        int[] encoded = new int[]{6, 2, 7, 3};
        int first = 4;
        assertArrayEquals(new int[]{4, 2, 0, 7, 4}, decodeXoredArray.decode(encoded, first));
    }
}
