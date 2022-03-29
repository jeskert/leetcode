package com.jeskert.leetcode.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ArithmeticSubarrayTest {
    ArithmeticSubarray arithmeticSubarray = new ArithmeticSubarray();

    @Test
    public void test1() {
        int[] nums = new int[]{4, 6, 5, 9, 3, 7};
        int[] l = new int[]{0, 0, 2};
        int[] r = new int[]{2, 3, 5};
        List<Boolean> res = List.of(Boolean.TRUE, Boolean.FALSE, Boolean.TRUE);
        assertEquals(res, arithmeticSubarray.checkArithmeticSubarrays(nums, l, r));
    }
}