package com.jeskert.leetcode.easy;

public class FinalPriceWithSpecialDiscount {
    public int[] finalPrices(int[] prices) {
        int length = prices.length;
        int[] finalPrices = new int[length];
        finalPrices[length - 1] = prices[length - 1];
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j <= length - 1; j++) {
                if (prices[j] <= prices[i]) {
                    finalPrices[i] = prices[i] - prices[j];
                    break;
                }
                if (j == length - 1) {
                    finalPrices[i] = prices[i];
                }
            }
        }
        return finalPrices;
    }
}
