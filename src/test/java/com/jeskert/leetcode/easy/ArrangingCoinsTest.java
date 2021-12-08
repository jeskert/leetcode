package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrangingCoinsTest {
    ArrangingCoins arrangingCoins = new ArrangingCoins();

    @Test
    public void test1() {
        assertEquals(2, arrangingCoins.arrangeCoins(5));
        assertEquals(3, arrangingCoins.arrangeCoins(8));
        assertEquals(65535, arrangingCoins.arrangeCoins(2147483647));
    }
}