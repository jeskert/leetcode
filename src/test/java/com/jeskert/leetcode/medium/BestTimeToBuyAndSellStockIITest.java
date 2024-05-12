package com.jeskert.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockIITest {
    BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();

    @Test
    public void test1() {
        int[] prices = {7,1,5,3,6,4};
        int expected = 7;
        int result = bestTimeToBuyAndSellStockII.maxProfit(prices);
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        int[] prices = {1,2,3,4,5};
        int expected = 4;
        int result = bestTimeToBuyAndSellStockII.maxProfit(prices);
        assertEquals(expected, result);
    }

    @Test
    public void test3() {
        int[] prices = {7,6,4,3,1};
        int expected = 0;
        int result = bestTimeToBuyAndSellStockII.maxProfit(prices);
        assertEquals(expected, result);
    }
}