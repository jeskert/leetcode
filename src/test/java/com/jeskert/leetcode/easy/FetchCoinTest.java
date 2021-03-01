package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FetchCoinTest {

    FetchCoin fetchCoin = new FetchCoin();

    @Test
    public void test1() {
        int[] coins = new int[]{4, 2, 1};
        assertEquals(4, fetchCoin.minCount(coins));
    }

    @Test
    public void test2() {
        int[] coins = new int[]{2, 3, 10};
        assertEquals(8, fetchCoin.minCount(coins));
    }
}
