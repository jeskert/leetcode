package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePathsTest {
    UniquePaths uniquePaths = new UniquePaths();

    @Test
    public void test1() {
        assertEquals(28, uniquePaths.uniquePaths(3, 7));
        assertEquals(3, uniquePaths.uniquePaths(3, 2));
        assertEquals(28, uniquePaths.uniquePaths(7, 3));
        assertEquals(6, uniquePaths.uniquePaths(3, 3));
    }
}