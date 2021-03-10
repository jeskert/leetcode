package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionOfTwoArrayIITest {
    IntersectionOfTwoArrayII intersectionOfTwoArrayII = new IntersectionOfTwoArrayII();

    @Test
    public void test1() {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        assertArrayEquals(new int[]{2, 2}, intersectionOfTwoArrayII.intersect(nums1, nums2));
    }

    @Test
    public void test2() {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        assertArrayEquals(new int[]{4, 9}, intersectionOfTwoArrayII.intersect(nums1, nums2));
    }
}