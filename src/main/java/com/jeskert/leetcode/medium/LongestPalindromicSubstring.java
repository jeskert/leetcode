package com.jeskert.leetcode.medium;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String res = s.substring(0, 1);

        for (int i = 0; i < s.length() - 1; i++) {
            String odd = getPalindrome(s, i, i);
            if (odd.length() > res.length()) {
                res = odd;
            }
            String even = getPalindrome(s, i, i + 1);
            if (even.length() > res.length()) {
                res = even;
            }
        }
        return res;
    }

    private String getPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
