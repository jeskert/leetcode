package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthMissingPositiveNumberTest {
    KthMissingPositiveNumber kthMissingPositiveNumber = new KthMissingPositiveNumber();

    @Test
    public void test1() {
        assertEquals(9, kthMissingPositiveNumber.findKthPositive(new int[]{2, 3, 4, 7, 11}, 5));
        assertEquals(6, kthMissingPositiveNumber.findKthPositive(new int[]{1, 2, 3, 4}, 2));
    }
}