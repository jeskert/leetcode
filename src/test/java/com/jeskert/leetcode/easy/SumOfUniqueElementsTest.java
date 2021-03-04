package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfUniqueElementsTest {
    SumOfUniqueElements sumOfUniqueElements = new SumOfUniqueElements();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 2};
        assertEquals(4, sumOfUniqueElements.sumOfUnique(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 1, 1, 1, 1};
        assertEquals(0, sumOfUniqueElements.sumOfUnique(nums));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        assertEquals(15, sumOfUniqueElements.sumOfUnique(nums));
    }
}