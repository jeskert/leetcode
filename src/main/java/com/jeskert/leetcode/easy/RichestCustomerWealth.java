package com.jeskert.leetcode.easy;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for (int[] account : accounts) {
            int currentSum = 0;
            for (int value : account) {
                currentSum += value;
            }
            if (currentSum > maximumWealth) {
                maximumWealth = currentSum;
            }
        }
        return maximumWealth;
    }
}
