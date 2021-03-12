package com.jeskert.leetcode.easy;

public class MinimumChangeToMakeAlternatingBinaryString {
    public int minOperation(String s) {
        int length = s.length();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) % 2 != i % 2) {
                count1++;
            } else {
                count2++;
            }
        }
        return Math.min(count1, count2);
    }

}
