package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateIITest {

    ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 1};
        assertTrue(containsDuplicateII.containsNearbyDuplicate(nums, 3));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 0, 1, 1};
        assertTrue(containsDuplicateII.containsNearbyDuplicate(nums, 1));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        assertFalse(containsDuplicateII.containsNearbyDuplicate(nums, 2));
    }
}