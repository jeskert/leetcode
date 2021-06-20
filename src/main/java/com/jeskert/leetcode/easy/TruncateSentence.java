package com.jeskert.leetcode.easy;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] split = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i != k - 1) {
                res.append(split[i]).append(" ");
            } else {
                res.append(split[i]);
            }
        }
        return res.toString();
    }
}
