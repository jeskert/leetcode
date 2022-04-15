package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangeTest {
    CoinChange coinChange = new CoinChange();

    @Test
    public void test1() {
        assertEquals(3, coinChange.coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(-1, coinChange.coinChange(new int[]{2}, 3));
        assertEquals(0, coinChange.coinChange(new int[]{1}, 0));
    }
}