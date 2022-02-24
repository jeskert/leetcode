package com.jeskert.leetcode.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder res = new StringBuilder();
        loop: for (int i = 0; i < strs[0].length(); i++) {
            char target = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() - 1 < i || target != strs[j].charAt(i)) {
                    break loop;
                }
            }
            res.append(target);
        }
        return res.toString();
    }
}
