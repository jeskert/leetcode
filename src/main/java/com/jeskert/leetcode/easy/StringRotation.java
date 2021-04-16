package com.jeskert.leetcode.easy;

public class StringRotation {
    public boolean isFlipedString(String s1, String s2) {
        String sumStr = s2 + s2;
        int startIndex = sumStr.indexOf(s1);
        if (startIndex == -1) {
            return false;
        }

        String restStr = sumStr.substring(0, startIndex) + sumStr.substring(startIndex + s1.length());
        return restStr.equals(s2);
    }
}
