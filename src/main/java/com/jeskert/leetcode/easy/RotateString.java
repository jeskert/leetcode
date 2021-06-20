package com.jeskert.leetcode.easy;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        for (int i = 1; i <= s.length() / 2; i++) {
            if ((s.substring(i) + s.substring(0, i)).equals(goal)) {
                return true;
            }
            if ((s.substring(0, s.length() - i) + s.substring(s.length() - i, s.length() - 1)).equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
