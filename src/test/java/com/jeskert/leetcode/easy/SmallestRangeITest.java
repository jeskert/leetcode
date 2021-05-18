package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestRangeITest {
    SmallestRangeI smallestRangeI = new SmallestRangeI();

    @Test
    public void test1() {
        assertEquals(0, smallestRangeI.smallestRangeI(new int[]{1}, 0));
        assertEquals(6, smallestRangeI.smallestRangeI(new int[]{0, 10}, 2));
        assertEquals(0, smallestRangeI.smallestRangeI(new int[]{1, 3, 6}, 3));
    }
}
