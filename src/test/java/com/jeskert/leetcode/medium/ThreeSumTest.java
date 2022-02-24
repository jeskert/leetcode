package com.jeskert.leetcode.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThreeSumTest {
    ThreeSum threeSum = new ThreeSum();

    @Test
    public void test1() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<Integer> list1 = Arrays.asList(-1, -1, 2);
        List<Integer> list2 = Arrays.asList(-1, 0, 1);
        List<List<Integer>> expected = Arrays.asList(list1, list2);
        List<List<Integer>> res = threeSum.threeSum(nums);

        assertEquals(expected, res);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{};
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, threeSum.threeSum(nums));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{0};
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, threeSum.threeSum(nums));
    }

    @Test
    public void test4() {
        int[] nums = new int[]{0,0,0,0};
        List<Integer> list1 = Arrays.asList(0, 0, 0);
        List<List<Integer>> expected = Collections.singletonList(list1);
        assertEquals(expected, threeSum.threeSum(nums));
    }

    @Test
    public void test5() {
        int[] nums = new int[]{-2, 0, 0, 2, 2};
        List<Integer> list1 = Arrays.asList(-2, 0, 2);
        List<List<Integer>> expected = Collections.singletonList(list1);
        assertEquals(expected, threeSum.threeSum(nums));
    }
}