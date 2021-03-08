package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class WaterBottlesTest {
    WaterBottles waterBottles = new WaterBottles();

    @Test
    public void test1() {
        assertEquals(13, waterBottles.numWaterBottles(9, 3));
    }

    @Test
    public void test2() {
        assertEquals(19, waterBottles.numWaterBottles(15, 4));
    }

    @Test
    public void test3() {
        assertEquals(6, waterBottles.numWaterBottles(5, 5));
    }

    @Test
    public void test4() {
        assertEquals(2, waterBottles.numWaterBottles(2, 3));
    }

    @Test
    public void test5() {
        assertEquals(17, waterBottles.numWaterBottles(15, 8));
    }
}