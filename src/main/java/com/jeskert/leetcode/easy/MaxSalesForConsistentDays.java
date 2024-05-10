package com.jeskert.leetcode.easy;

public class MaxSalesForConsistentDays {
    public int maxSales(int[] sales) {
        int pre = 0;
        int max = sales[0];
        for (int x : sales) {
            pre = Math.max(x, x + pre);
            max = Math.max(max, pre);
        }

        return max;
    }
}
