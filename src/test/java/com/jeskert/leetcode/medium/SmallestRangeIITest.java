package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestRangeIITest {
    SmallestRangeII smallestRangeII = new SmallestRangeII();

    @Test
    public void test1() {
        assertEquals(0, smallestRangeII.smallestRangeII(new int[]{1}, 0));
        assertEquals(6, smallestRangeII.smallestRangeII(new int[]{0, 10}, 2));
        assertEquals(3, smallestRangeII.smallestRangeII(new int[]{1, 3, 6}, 3));
    }
}