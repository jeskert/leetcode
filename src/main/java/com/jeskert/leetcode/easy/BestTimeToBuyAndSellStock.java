package com.jeskert.leetcode.easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int best = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > best) {
                    best = prices[j] - prices[i];
                }
            }
        }
        return best;
    }
}
