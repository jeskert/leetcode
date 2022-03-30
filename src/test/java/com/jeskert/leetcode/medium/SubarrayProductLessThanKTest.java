package com.jeskert.leetcode.medium;

import org.junit.Test;

import java.net.http.HttpClient;

import static org.junit.Assert.*;

public class SubarrayProductLessThanKTest {
    SubarrayProductLessThanK subarrayProductLessThanK = new SubarrayProductLessThanK();

    @Test
    public void test1() {
        assertEquals(8, subarrayProductLessThanK.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
        assertEquals(0, subarrayProductLessThanK.numSubarrayProductLessThanK(new int[]{1, 2, 3}, 0));
        assertEquals(18, subarrayProductLessThanK.numSubarrayProductLessThanK(new int[]{10, 9, 10, 4, 3, 8, 3, 3, 6, 2, 10, 10, 9, 3}, 19));
    }
}