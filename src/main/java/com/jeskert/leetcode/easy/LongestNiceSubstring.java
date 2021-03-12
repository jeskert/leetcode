package com.jeskert.leetcode.easy;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestNiceSubstring {
    public String longestNiceSubstring(String s) {
        int len = s.length();
        String res = "";
        if (len < 2) {
            return "";
        }
        for (int i = 2; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                String str = s.substring(j, i);
                if (str.length() > res.length() && isNice(str)) {
                    res = str;
                }
            }
        }
        return res;
    }

    private boolean isNice(String t) {
        Set<Character> lowerAlphabet = new HashSet<>();
        Set<Character> upperAlphabet = new HashSet<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (Character.isLowerCase(c)) {
                lowerAlphabet.add(c);
            }
            if (Character.isUpperCase(c)) {
                upperAlphabet.add(c);
            }
        }
        return upperAlphabet.equals(lowerAlphabet.stream().map(ch -> (char)(ch - 32)).collect(Collectors.toSet()));
    }
}
