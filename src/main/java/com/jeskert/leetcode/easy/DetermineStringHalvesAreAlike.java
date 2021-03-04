package com.jeskert.leetcode.easy;

import java.util.Arrays;
import java.util.List;

public class DetermineStringHalvesAreAlike {

    private static final List<String> yuanyin = Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");
    public boolean halvesAreAlike(String s) {
        String s1 = s.substring(s.length() / 2);
        int res = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (yuanyin.contains(String.valueOf(s1.charAt(i)))) {
                res++;
            }
        }
        String s2 = s.substring(0, s.length() / 2);
        int res1 = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (yuanyin.contains(String.valueOf(s2.charAt(i)))) {
                res1++;
            }
        }
        return res1 == res;
    }

}
