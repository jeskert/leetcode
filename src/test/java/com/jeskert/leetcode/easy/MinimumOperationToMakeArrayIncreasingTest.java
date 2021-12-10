package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumOperationToMakeArrayIncreasingTest {
    MinimumOperationToMakeArrayIncreasing minimumOperationToMakeArrayIncreasing = new MinimumOperationToMakeArrayIncreasing();

    @Test
    public void test1() {
        assertEquals(3, minimumOperationToMakeArrayIncreasing.minOperation(new int[]{1, 1, 1}));
        assertEquals(14, minimumOperationToMakeArrayIncreasing.minOperation(new int[]{1, 5, 2, 4, 1}));
        assertEquals(0, minimumOperationToMakeArrayIncreasing.minOperation(new int[]{8}));
    }
}