package com.jeskert.leetcode.easy;

public class NumberOfSegments {
    public int countSegments(String s) {
        int res = 0;
        if (s.length() == 0) {
            return 0;
        }
        boolean prevIsSpace = true;
        for (int i = 0; i < s.length(); i++) {
            boolean currentIsSpace = s.charAt(i) == ' ';
            if (prevIsSpace && !currentIsSpace) {
                res++;
            }
            prevIsSpace = currentIsSpace;
        }
        return res;
    }
}
