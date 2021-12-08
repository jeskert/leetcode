package com.jeskert.leetcode.easy;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        if (n == 0) {
            return 0;
        }
        int i = 1;
        long sum = 0;
        while (sum <= n) {
            sum += i;
            if (n - sum == i + 1) {
                return i + 1;
            }
            i++;
        }
        return i - 2;
    }
}
