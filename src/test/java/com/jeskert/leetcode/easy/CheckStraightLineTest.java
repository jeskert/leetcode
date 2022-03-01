package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckStraightLineTest {
    CheckStraightLine checkStraightLine = new CheckStraightLine();

    @Test
    public void test1() {
        assertTrue(checkStraightLine.checkStraightLine(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}}));
        assertFalse(checkStraightLine.checkStraightLine(new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}}));
        assertFalse(checkStraightLine.checkStraightLine(new int[][]{{0, 0}, {0, 5}, {5, 5}, {5, 0}}));
        assertTrue(checkStraightLine.checkStraightLine(new int[][]{{0, 0}, {0, 1}, {0, -1}}));
        assertFalse(checkStraightLine.checkStraightLine(new int[][]{{-4, -3}, {1, 0}, {3, -1}, {0, -1}, {-5, 2}}));
    }
}