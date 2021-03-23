package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumUnitsOnATruckTest {
    MaximumUnitsOnATruck maximumUnitsOnATruck = new MaximumUnitsOnATruck();

    @Test
    public void test1() {
        int[][] boxTypes = new int[][]{{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;
        assertEquals(8, maximumUnitsOnATruck.maximumUnits(boxTypes, truckSize));
    }

    @Test
    public void test2() {
        int[][] boxTypes = new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int truckSize = 10;
        assertEquals(91, maximumUnitsOnATruck.maximumUnits(boxTypes, truckSize));
    }
}