package com.jeskert.leetcode.easy;

public class MaximumPopulationYear {
    public int maximumPopulation(int[][] logs) {
        int max = 0;
        int maxYear = 1950;
        for (int i = 1950; i <= 2050; i++) {
            int res = 0;
            for (int j = 0; j < logs.length; j++) {
                if (i >= logs[j][0] && i < logs[j][1]) {
                    res++;
                }
            }
            if (res > max) {
                max = res;
                maxYear = i;
            }
        }
        return maxYear;
    }
}
