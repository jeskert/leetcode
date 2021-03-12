package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfArrayIsSortedAndRotatedTest {
    CheckIfArrayIsSortedAndRotated checkIfArrayIsSortedAndRotated = new CheckIfArrayIsSortedAndRotated();

    @Test
    public void test1() {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        assertTrue(checkIfArrayIsSortedAndRotated.check(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{2, 1, 3, 4};
        assertFalse(checkIfArrayIsSortedAndRotated.check(nums));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 2, 3};
        assertTrue(checkIfArrayIsSortedAndRotated.check(nums));
    }

    @Test
    public void test4() {
        int[] nums = new int[]{1, 1, 1};
        assertTrue(checkIfArrayIsSortedAndRotated.check(nums));
    }

    @Test
    public void test6() {
        int[] nums = new int[]{2, 1};
        assertTrue(checkIfArrayIsSortedAndRotated.check(nums));
    }
}