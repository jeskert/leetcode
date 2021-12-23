package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindCenterOfStarGraphTest {
    FindCenterOfStarGraph findCenterOfStarGraph = new FindCenterOfStarGraph();

    @Test
    public void test1() {
        int[][] edges = new int[][]{{1, 2}, {2, 3}, {4, 2}};
        assertEquals(2, findCenterOfStarGraph.findCenter(edges));
    }

    @Test
    public void test2() {
        int[][] edges = new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}};
        assertEquals(1, findCenterOfStarGraph.findCenter(edges));
    }

    @Test
    public void test3() {
        int[][] edges = new int[][]{{1, 3}, {2, 3}};
        assertEquals(3, findCenterOfStarGraph.findCenter(edges));
    }
}