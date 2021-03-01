package com.jeskert.leetcode.easy;

public class FindHighestAttitude {

    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        int max = 0;
        altitude[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude[i + 1] = altitude[i] + gain[i];
            if (altitude[i + 1] > max) {
                max = altitude[i + 1];
            }
        }
        return max;
    }
}
