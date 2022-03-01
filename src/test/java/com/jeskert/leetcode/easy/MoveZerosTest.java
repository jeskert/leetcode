package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZerosTest {
    MoveZeros moveZeros = new MoveZeros();

    @Test
    public void test1() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeros.moveZeroes(nums);
        assertArrayEquals(nums, new int[]{1, 3, 12, 0, 0});
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0};
        moveZeros.moveZeroes(nums);
        assertArrayEquals(nums, new int[]{0});
    }
}