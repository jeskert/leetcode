package com.jeskert.leetcode.easy;

public class DecryptString {
    public String freqAlphabets(String s) {
        char[] charArr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArr[i] = ' ';
        }
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == '#') {
                int a = Integer.parseInt(s.substring(i - 2, i));
                charArr[i] = (char) (a + 96);
                i -= 3;
            } else {
                int a = Integer.parseInt(s.substring(i, i + 1));
                charArr[i] = (char) (a + 96);
                i--;
            }
        }
        return new String(charArr).replaceAll(" ", "");
    }
}
