package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PeakIndexInAMountainArrayTest {
    PeakIndexInAMountainArray peakIndexInAMountainArray = new PeakIndexInAMountainArray();

    @Test
    public void test1(){
        assertEquals(1, peakIndexInAMountainArray.peakIndexInMountainArray(new int[]{0, 1, 0}));
        assertEquals(1, peakIndexInAMountainArray.peakIndexInMountainArray(new int[]{0, 2, 1, 0}));
        assertEquals(1, peakIndexInAMountainArray.peakIndexInMountainArray(new int[]{0, 10, 5, 2}));
        assertEquals(2, peakIndexInAMountainArray.peakIndexInMountainArray(new int[]{3, 4, 5, 1}));
        assertEquals(2, peakIndexInAMountainArray.peakIndexInMountainArray(new int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19}));
    }
}