package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedArrayTest {
    MergeTwoSortedArray mergeTwoSortedArray = new MergeTwoSortedArray();

    @Test
    public void test1() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        mergeTwoSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void test2() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int m = 0;
        int n = 1;
        mergeTwoSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void test3() {
        int[] nums1 = new int[]{2, 0};
        int[] nums2 = new int[]{1};
        int m = 1;
        int n = 1;
        mergeTwoSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1, 2}, nums1);
    }
}