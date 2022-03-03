package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumIfInputArrayIsSortedTest {
    TwoSumIfInputArrayIsSorted twoSumIfInputArrayIsSorted = new TwoSumIfInputArrayIsSorted();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2}, twoSumIfInputArrayIsSorted.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 3}, twoSumIfInputArrayIsSorted.twoSum(new int[]{2, 3, 4}, 6));
        assertArrayEquals(new int[]{1, 2}, twoSumIfInputArrayIsSorted.twoSum(new int[]{-1, 0}, -1));
    }
}