package com.jeskert.leetcode.easy;

public class LatestTimeByReplacingHiddenDigits {
    public String maximumTime(String time) {
        for (int i = 0; i < time.length(); i++) {
            if (time.charAt(i) == '?') {
                if (i == 0) {
                    if (time.charAt(1) >= '4' && time.charAt(1) != '?') {
                        time = time.replaceFirst("[?]", "1");
                    } else {
                        time = time.replaceFirst("[?]", "2");
                    }
                } else if (i == 1) {
                    if (time.charAt(0) == '2') {
                        time = time.replaceFirst("[?]", "3");
                    } else {
                        time = time.replaceFirst("[?]", "9");
                    }
                } else if (i == 3) {
                    time = time.replaceFirst("[?]", "5");
                } else {
                    time = time.replaceFirst("[?]", "9");
                }
            }
        }
        return time;
    }
}
