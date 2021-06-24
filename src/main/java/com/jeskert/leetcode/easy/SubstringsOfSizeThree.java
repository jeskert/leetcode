package com.jeskert.leetcode.easy;

public class SubstringsOfSizeThree {
    public int countGoodSubString(String s) {
        int cnt = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            if (isGood(s.substring(i, i + 3))) {
                cnt++;
            }
        }
        return cnt;
    }

    private boolean isGood(String s) {
        return s.charAt(0) != s.charAt(1) && s.charAt(1) != s.charAt(2) && s.charAt(0) != s.charAt(2);
    }
}
