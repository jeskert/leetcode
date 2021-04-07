package com.jeskert.leetcode.easy;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for (int i = 1; i <= length / 2; i++) {
            boolean res = true;
            int startIndex = 0;
            String pattern = s.substring(0, i);
            while (startIndex < length) {
                if (startIndex + i <= length && s.substring(startIndex, startIndex + i).equals(pattern)) {
                    startIndex += i;
                } else {
                    res = false;
                    break;
                }
            }
            if (res) {
                return res;
            }
        }
        return false;
    }
}
