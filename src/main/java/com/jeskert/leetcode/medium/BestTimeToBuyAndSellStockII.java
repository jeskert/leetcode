package com.jeskert.leetcode.medium;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        // dp[i] = max(dp[i-1], prices[i] - min(prices[0:i]))

        int len = prices.length;
        int[] dp = new int[len];
        dp[0] = 0;

        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1], prices[i] - min(prices, 0, i));
        }
        return dp[len - 1];
    }

    private int min(int[] nums, int i, int j) {
        int min = nums[i];
        for (int k = i; k <= j; k++) {
            min = Math.min(min, nums[k]);
        }
        return min;
    }
}
