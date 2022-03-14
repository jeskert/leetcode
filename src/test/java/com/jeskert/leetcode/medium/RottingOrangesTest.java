package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class RottingOrangesTest {
    RottingOranges rottingOranges = new RottingOranges();

    @Test
    public void test1() {
        assertEquals(4, rottingOranges.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
        assertEquals(-1, rottingOranges.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
        assertEquals(0, rottingOranges.orangesRotting(new int[][]{{0, 2}}));
    }
}