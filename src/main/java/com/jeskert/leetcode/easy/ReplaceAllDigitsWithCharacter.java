package com.jeskert.leetcode.easy;

public class ReplaceAllDigitsWithCharacter {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                arr[i] = (char) (arr[i - 1] + arr[i] - '0');
            }
        }
        return new String(arr);
    }
}
