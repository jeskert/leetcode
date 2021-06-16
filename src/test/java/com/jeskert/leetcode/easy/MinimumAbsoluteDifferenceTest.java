package com.jeskert.leetcode.easy;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MinimumAbsoluteDifferenceTest {
    MinimumAbsoluteDifference minimumAbsoluteDifference = new MinimumAbsoluteDifference();

    @Test
    public void test1() {
        int[] arr = new int[]{4, 2, 1, 3};
        List<List<Integer>> result = minimumAbsoluteDifference.minimumAbsDifference(arr);
        assertEquals(1, result.get(0).get(0).intValue());
        assertEquals(2, result.get(0).get(1).intValue());
        assertEquals(2, result.get(1).get(0).intValue());
        assertEquals(3, result.get(1).get(1).intValue());
        assertEquals(3, result.get(2).get(0).intValue());
        assertEquals(4, result.get(2).get(1).intValue());
    }

    @Test
    public void test2() {
        int[] arr = new int[]{1, 3, 6, 10, 15};
        List<List<Integer>> result = minimumAbsoluteDifference.minimumAbsDifference(arr);
        assertEquals(1, result.get(0).get(0).intValue());
        assertEquals(3, result.get(0).get(1).intValue());
    }

    @Test
    public void test3() {
        int[] arr = new int[]{3, 8, -10, 23, 19, -4, -14, 27};
        List<List<Integer>> result = minimumAbsoluteDifference.minimumAbsDifference(arr);
        assertEquals(-14, result.get(0).get(0).intValue());
        assertEquals(-10, result.get(0).get(1).intValue());
        assertEquals(19, result.get(1).get(0).intValue());
        assertEquals(23, result.get(1).get(1).intValue());
        assertEquals(23, result.get(2).get(0).intValue());
        assertEquals(27, result.get(2).get(1).intValue());
    }
}
