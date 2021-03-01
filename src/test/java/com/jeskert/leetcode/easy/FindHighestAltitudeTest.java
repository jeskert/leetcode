package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindHighestAltitudeTest {

    FindHighestAttitude findHighestAttitude = new FindHighestAttitude();

    @Test
    public void test1() {
        int[] gain = new int[]{-5, 1, 5, 0, -7};
        assertEquals(1, findHighestAttitude.largestAltitude(gain));
    }

    @Test
    public void test2() {
        int[] gain = new int[]{-4, -3, -2, -1, 4, 3, 2};
        assertEquals(0, findHighestAttitude.largestAltitude(gain));
    }
}
