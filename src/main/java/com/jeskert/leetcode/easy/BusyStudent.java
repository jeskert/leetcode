package com.jeskert.leetcode.easy;

public class BusyStudent {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                res++;
            }
        }
        return res;
    }
}
