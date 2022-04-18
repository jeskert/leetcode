package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheDistanceValueTest {
    FindTheDistanceValue findTheDistanceValue = new FindTheDistanceValue();

    @Test
    public void test1() {
        assertEquals(2, findTheDistanceValue.findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2));
        assertEquals(2, findTheDistanceValue.findTheDistanceValue(new int[]{1, 4, 2, 3}, new int[]{-4, -3, 6, 10, 20, 30}, 3));
        assertEquals(1, findTheDistanceValue.findTheDistanceValue(new int[]{2, 1, 100, 3}, new int[]{-5, -2, 10, -3, 7}, 6));
    }
}