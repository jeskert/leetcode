package com.jeskert.leetcode.medium;

public class BestSightseeingPair {
    public int maxScoreSightseeingPair(int[] values) {
        int last = values[0];
        int max = 0;
        for (int i = 1; i < values.length; i++) {
            max = Math.max(last + values[i] - i, max);
            last = Math.max(last, values[i] + i);
        }
        return max;
    }

}
