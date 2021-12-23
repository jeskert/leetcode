package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class HammingDistanceTest {
    HammingDistance hammingDistance = new HammingDistance();

    @Test
    public void test1() {
        assertEquals(2, hammingDistance.hammingDistance(1, 4));
        assertEquals(1, hammingDistance.hammingDistance(3, 1));
    }
}