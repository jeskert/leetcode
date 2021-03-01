package com.jeskert.leetcode.easy;

public class FetchCoin {
    public int minCount(int[] coins) {
        int res = 0;
        for (int coin : coins) {
            res += (coin + 1) / 2;
        }
        return res;
    }
}
