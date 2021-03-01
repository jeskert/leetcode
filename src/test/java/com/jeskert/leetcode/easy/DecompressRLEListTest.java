package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DecompressRLEListTest {

    DecompressRLEList decompressRLEList = new DecompressRLEList();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 4};
        assertArrayEquals(new int[]{2, 4, 4, 4}, decompressRLEList.decompressRLElist(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 1, 2, 3};
        assertArrayEquals(new int[]{1, 3, 3}, decompressRLEList.decompressRLElist(nums));
    }
}
