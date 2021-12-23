package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistributeCandiesTest {
    DistributeCandies distributeCandies = new DistributeCandies();

    @Test
    public void test1() {
        assertEquals(3, distributeCandies.distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
        assertEquals(2, distributeCandies.distributeCandies(new int[]{1, 1, 2, 3}));
        assertEquals(1, distributeCandies.distributeCandies(new int[]{6, 6, 6, 6}));
    }
}