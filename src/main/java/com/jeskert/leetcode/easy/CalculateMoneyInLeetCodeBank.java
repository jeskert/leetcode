package com.jeskert.leetcode.easy;

public class CalculateMoneyInLeetCodeBank {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int total = 0;
        for (int i = 0; i < weeks; i++) {
            total += 7 * (i + 4);
        }
        for (int i = 1; i <= n % 7; i++) {
            total += weeks + i;
        }
        return total;
    }
}
