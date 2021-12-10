package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeightCheckerTest {
    HeightChecker heightChecker = new HeightChecker();

    @Test
    public void test1() {
        assertEquals(3, heightChecker.heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
        assertEquals(5, heightChecker.heightChecker(new int[]{5, 1, 2, 3, 4}));
        assertEquals(0, heightChecker.heightChecker(new int[]{1, 2, 3, 4, 5}));
    }
}