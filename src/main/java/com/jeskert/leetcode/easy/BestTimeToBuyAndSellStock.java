package com.jeskert.leetcode.easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int currentMinPrice = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (currentMinPrice > prices[i]) {
                currentMinPrice = prices[i];
            } else {
                res = Math.max(prices[i] - currentMinPrice, res);
            }
        }
        return res;
    }
}
