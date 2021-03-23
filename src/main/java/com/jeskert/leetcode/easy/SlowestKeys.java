package com.jeskert.leetcode.easy;

public class SlowestKeys {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int slowestTime = releaseTimes[0];
        char result = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; i++) {
            int pressTime = releaseTimes[i] - releaseTimes[i - 1];
            char pressed = keysPressed.charAt(i);
            if (pressTime > slowestTime) {
                slowestTime = pressTime;
                result = pressed;
            } else if (pressTime == slowestTime) {
                if (pressed > result) {
                    result = pressed;
                }
            }
        }
        return result;
    }
}
