package com.jeskert.leetcode.medium;

public class TimeNeededToInformAllEmployees {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int maxCount = 0;
        for (int i = 0; i < manager.length; i++) {
            if (informTime[i] == 0) {
                int count = 0;
                int currIndex = i;
                while (currIndex != -1) {
                    count += informTime[currIndex];
                    currIndex = manager[currIndex];
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }


}
