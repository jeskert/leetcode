package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray.rotate(nums, k);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{-1, -100, 3, 99};
        rotateArray.rotate(nums, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }
}