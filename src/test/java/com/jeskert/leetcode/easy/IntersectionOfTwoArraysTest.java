package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionOfTwoArraysTest {
    IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();

    @Test
    public void test1() {
        int[] res = intersectionOfTwoArrays.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        assertArrayEquals(new int[]{2}, res);
    }

    @Test
    public void test2() {
        int[] res = intersectionOfTwoArrays.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        assertArrayEquals(new int[]{9, 4}, res);
    }
}
