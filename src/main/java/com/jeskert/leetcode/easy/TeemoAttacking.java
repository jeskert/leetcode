package com.jeskert.leetcode.easy;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0;
        int expired = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (timeSeries[i] >= expired) {
                res += duration;
            } else {
                res += timeSeries[i] + duration - expired;
            }
            expired = timeSeries[i] + duration;
        }
        return res;
    }
}
