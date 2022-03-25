package com.jeskert.leetcode.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = s.length();
        int res = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (res == 0) {
                    continue;
                } else {
                    break;
                }
            }
            if (s.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }
}
