package com.jeskert.leetcode.easy;

public class SecondLargestInString {
    public int secondHighest(String s) {
        int[] digits = new int[10];
        int secondHightest = -1;
        int highest = -1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digits[s.charAt(i) - '0'] = 1;
            }
        }
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 1) {
                if (i > highest) {
                    secondHightest = highest;
                    highest = i;
                }
            }
        }
        return secondHightest;
    }
}
